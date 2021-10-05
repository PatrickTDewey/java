package com.pdewey.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pdewey.models.Book;
import com.pdewey.services.BookService;

@RestController
public class BookApi {
	private final BookService bookService;

	public BookApi(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@RequestMapping("/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}
	
	@PostMapping("/api/books")
	public Book create(@RequestParam(value="title") String title,
			@RequestParam(value="description") String description,
			@RequestParam(value="language") String language,
			@RequestParam(value="pages") Integer numOfPages) {
		
		Book book = new Book(title, description, language , numOfPages);
		return bookService.createBook(book);
	}
	
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = bookService.findBook(id);
		return book;
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	public Book update(
			@PathVariable(value="id") Long id,
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String description,
			@RequestParam(value="language") String language,
			@RequestParam(value="pages") Integer pages
			) {
		Book book = bookService.updateBook(id, title, description, language, pages);
		return book;
		
	}
	
	@RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
	public void destory(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
}
