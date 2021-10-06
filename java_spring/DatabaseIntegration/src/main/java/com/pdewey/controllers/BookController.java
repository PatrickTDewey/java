package com.pdewey.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pdewey.models.Book;
import com.pdewey.services.BookService;

@Controller
public class BookController {

	// Auto wired takes care of dependency injection for us so we don't
	// Need to add the parameter in our methods

	@Autowired
	BookService bookService;

	// ********** Display Routes ***************

	@GetMapping( "/" )
	public String index() {

		return "redirect:/books";
	}

	@GetMapping( "/books" )
	public String viewAllBooks(Model model) {

		ArrayList<Book> allBooks = ( ArrayList<Book> ) bookService.allBooks();

		for (Book book : allBooks) {

			System.out.println( book.getTitle() );
		}

		model.addAttribute( "allBooks", allBooks );

		return "/books/index.jsp";
	}

	@GetMapping( "/books/{bookId}" )
	public String viewBook(@PathVariable( "bookId" ) Long bookId, Model model) {

		Book book = bookService.findBook( bookId );
		
		model.addAttribute( "book", book );

		return "/books/bookDetails.jsp";
	}

	@GetMapping( "/books/new" )
	public String bookFormView(@ModelAttribute( "book" ) Book book) {

		return "/books/newBook.jsp";
	}

	// ********** Action Routes ****************

	@PostMapping( "/books/create" )
	public String addBook(@Valid @ModelAttribute( "book" ) Book book, BindingResult result) {

		if ( result.hasErrors() ) {

			return "/books/newBook.jsp";
		}

		else {
			bookService.createBook( book );

			return "redirect:/";
		}
	}
}
