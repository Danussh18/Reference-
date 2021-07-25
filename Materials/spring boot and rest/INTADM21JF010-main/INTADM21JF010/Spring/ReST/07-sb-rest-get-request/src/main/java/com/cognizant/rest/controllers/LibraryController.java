package com.cognizant.rest.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.rest.bindings.Book;

@RestController
@RequestMapping("/library")
public class LibraryController {
	@GetMapping(value = "/book", 
				produces = { "application/json", "application/xml" }
			   )
	public ResponseEntity<Book> getBook() {
		Book book = new Book();
		book.setBookId(101245L);
		book.setBookName("Spring Boot with MIcroservices");
		book.setBookPrice(750.75f);

		ResponseEntity<Book> entity = new ResponseEntity<>(book, HttpStatus.OK);

		return entity;
	}

	@GetMapping(value = "/book/{isbn}", 
				produces = { "application/json", "application/xml" }
			   )
	public ResponseEntity<Book> getBookByIsbn(@PathVariable Long isbn) {
		// Logic to get book details from DB
		Book book = new Book();
		book.setBookId(isbn);
		book.setBookName("Java Complete Reference");
		book.setBookPrice(550.75f);

		ResponseEntity<Book> entity = new ResponseEntity<>(book, HttpStatus.OK);

		return entity;
	}

	@GetMapping(value = "/all", produces = { "application/xml", "application/json" })
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = Arrays.asList(new Book(1L, "Java Complete Reference", 375.5f),
				new Book(2L, "Python Complete Reference", 355.5f), 
				new Book(3L, ".NET Complete Reference", 575.5f),
				new Book(4L, "Datascince Made Simple", 775f));

		return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
	}
}
