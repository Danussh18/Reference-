package com.cognizant.library.exceptions;

import java.util.Set;

public class AuthorFieldNotAvailableException extends RuntimeException {
 public AuthorFieldNotAvailableException(Set<String> fields) {
	 super("Author field is not available in the Request; it contains the fields as "+ fields);
 }
}
