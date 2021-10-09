package com.pdewey.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdewey.bookclub.models.Book;
import com.pdewey.bookclub.repositories.BookRepository;

@Service
public class BookService {
	
		// ***** Auto Add Repository Dependency ****
	
		@Autowired
		private BookRepository bookRepo;
		
		// ********** Create / Update **************
		
		public Book save( Book book ) {
			
			return bookRepo.save( book );
		}

		// ********** Find One *********************
		
		public Book findOne( Long id ) {
				
			Optional<Book> bookOptional = bookRepo.findById( id );
			
			if( bookOptional.isPresent() ) {
				
				return bookOptional.get();
			}

			else {
				
				return null;
			}
		}

		// ********** Find All *********************
		
		public List<Book> findAll(){
			
			return bookRepo.findAll();
		}
		

		// ********** Delete ***********************
		
		public void delete( Long id ) {
			
			bookRepo.deleteById( id );
		}
}
