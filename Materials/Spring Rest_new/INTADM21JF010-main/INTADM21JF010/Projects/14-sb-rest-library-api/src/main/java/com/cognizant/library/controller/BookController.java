package com.cognizant.library.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.library.entity.Book;
import com.cognizant.library.exceptions.AuthorFieldNotAvailableException;
import com.cognizant.library.exceptions.BookNotFoundException;
import com.cognizant.library.repository.BookRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@Validated
public class BookController {
 @Autowired	
 private BookRepository bookRepo;
 
 //get all the books
 @ApiOperation("API to get All Books")
 @GetMapping("/all")
 public List<Book> getAllBooks(){
	 return bookRepo.findAll();
 }
 
 //get the details of a Book based on Book ID
 @GetMapping("/search/{bid}")
 public Book getBookByBookId(@PathVariable @Min(1) Long bid) {
	 Book book = bookRepo.findById(bid)
			 			 .orElseThrow(()->new BookNotFoundException(bid));
	 return book;
 }
 
 //to make a New Book entry
 @PostMapping("/save")
 @ResponseStatus(HttpStatus.CREATED)
 public Book addNewBook(@Valid @RequestBody Book newBook) {
	 Book savedBook = bookRepo.save(newBook);
	 return savedBook;
 }
 
 //to add a new book or to update an existing book
 @PutMapping("/saveorupdate/{bid}")
 public Book saveOrUpdateBook(@RequestBody Book existingBook, @PathVariable Long bid) {
	 return bookRepo.findById(bid)			 
	 		 .map(book -> {
	 			 book.setBookTitle(existingBook.getBookTitle());
	 			 book.setBookAuthor(existingBook.getBookAuthor());
	 			 book.setBookPrice(existingBook.getBookPrice());
	 			 return bookRepo.save(book);
	 		 })
	 		 .orElseGet(()->{
	 			 //existingBook.setBookId(bid);
	 			 return bookRepo.save(existingBook);	 			 
	 		 });
 }
 
 //to do a partial updation (only update author name)
 @PatchMapping("/updateauthor/{bid}")
 public Book updateAuthorName(@RequestBody Map<String,String> authorMap, @PathVariable Long bid) {
	 return bookRepo.findById(bid)			 
	 		 .map(book -> {	 			 
	 			 String newAuthorName = authorMap.get("author");
	 			 //if(!StringUtils.isEmpty(newAuthorName)) {
	 			 if(!ObjectUtils.isEmpty(newAuthorName)) {
	 				 book.setBookAuthor(newAuthorName);
	 				 return bookRepo.save(book);
	 			 }else {
	 				throw new AuthorFieldNotAvailableException(authorMap.keySet()); 
	 			 }
	 		 })
	 		 .orElseGet(()->{
	 			 throw new BookNotFoundException(bid); 			 
	 		 });	 
 }
 
 //to delete a Book based on Book Id
 @DeleteMapping("/delete/{bid}")
 public ResponseEntity<String> deleteBookById(@PathVariable Long bid){
	 bookRepo.deleteById(bid);
	 return new ResponseEntity<String>("Book with Book ID: "+ bid+" deleted!", HttpStatus.OK);		 
 }
}
