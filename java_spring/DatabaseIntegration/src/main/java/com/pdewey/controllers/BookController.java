package com.pdewey.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;

import com.pdewey.models.Book;
import com.pdewey.services.BookService;

@Controller
public class BookController {
	
	// Auto wired takes care of dependency injection for us so we don't need to add the parameter in our methods
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/")
	public String index(){
		return "redirect:/books";
	}
	
	@GetMapping("/books")
	public String viewAllBooks(Model model) {
		
		ArrayList<Book> allBooks = (ArrayList<Book>) bookService.allBooks();
		for (Book book : allBooks) {
			System.out.println(book.getTitle());
		}
		
		model.addAttribute("allBooks", allBooks);
		
		return "index.jsp";
	}
	
	@GetMapping("/books/{bookId}")
	public String viewBook(@PathVariable("bookId") Long bookId, Model model) {
		
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		
		return "bookDetails.jsp";
	}
}
