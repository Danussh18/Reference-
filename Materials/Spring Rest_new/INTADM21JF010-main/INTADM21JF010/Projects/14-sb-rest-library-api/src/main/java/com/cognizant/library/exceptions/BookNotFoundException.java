package com.cognizant.library.exceptions;

public class BookNotFoundException extends RuntimeException{
 public BookNotFoundException(Long bid) {
	 super("Book with ID: "+bid+" NOT in Library");
 }
}
