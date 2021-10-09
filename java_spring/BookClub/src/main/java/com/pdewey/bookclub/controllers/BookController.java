package com.pdewey.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.pdewey.bookclub.models.Book;
import com.pdewey.bookclub.models.User;
import com.pdewey.bookclub.services.BookService;
import com.pdewey.bookclub.services.UserService;

@Controller
public class BookController {
	// ********** Auto Add Repository Deps *****

	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	// ========== Display Routes =============== //
		
	// ********** Add View *********************
	
	@GetMapping( "/books/new" )
	public String add( @ModelAttribute( "book" ) Book book, Model model, HttpSession session ) {
		
		User user = userService.getUser( (Long) session.getAttribute("user_id") );
		
		model.addAttribute( "user", user );
		
		return "books/new.jsp";
	}
	
	// ********** Edit View ********************
	@GetMapping( "/books/edit/{book_id}" )
	public String edit( @PathVariable( "book_id" ) Long id, Model model ) {
		
		Book book = bookService.findOne( id );
		
		model.addAttribute( "book", book );
		
		return "books/edit.jsp";
	}
	

	// ********** Details View *****************
	
	@GetMapping( "/books/view/{id}" )
	public String details( @PathVariable( "id" ) Long id, Model model, HttpSession session ) {
		
		Book book = bookService.findOne( id );
		
		Long user_id = (Long) session.getAttribute("user_id");
		
		model.addAttribute( "book", book );
		
		model.addAttribute( "user_id", user_id );
		
		return "books/details.jsp";
	}
	
	// ========== Action Routes ================ //

	// ********** Create ***********************
	
	@PostMapping( "/books/new" )
	public String create( @Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session ) {
		
		if ( result.hasErrors() ) {
			
			User user = userService.getUser( (Long) session.getAttribute("user_id") );
			
			model.addAttribute( "user", user );
			
			return "books/new.jsp";
		}
		
		else {
			
			bookService.save( book );
			
			return "redirect:/home";
		}
		
	}

	// ********** Update ***********************
	
	@PutMapping( "/books/edit/{id}" )
	public String update(@Valid @ModelAttribute( "book" ) Book book, BindingResult result, Model model, HttpSession session) {
		
		if ( result.hasErrors() ) {
			
			User user = userService.getUser( (Long) session.getAttribute("user_id") );
			
			model.addAttribute( "user", user );
			
			return "books/new.jsp";
			
		}
		
		else {
			
			bookService.save( book );
			
			return "redirect:/books/view/" + book.getId();
		}
	}
}
