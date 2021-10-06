package com.pdewey.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.pdewey.models.Book;
import com.pdewey.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;
	
	// constructor
	public BookService(BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		
		return bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book b) {
		
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			
			return optionalBook.get();
			
		} 
			
		return null;
		
	}
	// update a book
	public Book updateBook(Long id, String title, String description, String language, Integer pages) {
		Optional<Book> getBook = bookRepository.findById(id);
		
		if(getBook.isPresent()) {
			Book updateBook = getBook.get();
			
			updateBook.setTitle(title);
			updateBook.setLanguage(language);
			updateBook.setDescription(description);
			updateBook.setNumberOfPages(pages);
			
			return bookRepository.save(updateBook);
			
		}
		
		return null;
	}

	// delete a book
	public void deleteBook(Long id) {
		
		bookRepository.deleteById(id);
		
	}
	
	
}
