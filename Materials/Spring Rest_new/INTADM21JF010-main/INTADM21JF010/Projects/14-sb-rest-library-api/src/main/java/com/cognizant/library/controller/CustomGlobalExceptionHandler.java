package com.cognizant.library.controller;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cognizant.library.exceptions.AuthorFieldNotAvailableException;
import com.cognizant.library.exceptions.BookNotFoundException;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {
 //spring handles the exception but we are overriding the status code 	
 @ExceptionHandler(BookNotFoundException.class)	
 public void handleBookNotFoundExcetion(HttpServletResponse response) throws IOException {
	 response.sendError(HttpStatus.NOT_FOUND.value());
 }

 @ExceptionHandler(AuthorFieldNotAvailableException.class)	
 public void handleAuthorFieldNotAvailableException(HttpServletResponse response) throws IOException {
	 response.sendError(HttpStatus.EXPECTATION_FAILED.value());
 } 
 
 @ExceptionHandler(ConstraintViolationException.class)
 public void handleContraintViolationException(HttpServletResponse response) throws IOException {
	 response.sendError(HttpStatus.BAD_REQUEST.value());
 }
 
 	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus httpStatus, WebRequest request) {
 
	 Map<String, String> errors = new LinkedHashMap<>();
	 
	 errors.put("error_code", httpStatus.value()+"");
	 errors.put("date", new Date().toString());
	 //store all the errors
	 List<String> validationErrors = ex.getBindingResult()
			 						   .getFieldErrors()
			 						   .stream()
			 						   .map(err -> err.getDefaultMessage())
			 						   .collect(Collectors.toList());
	 
	 errors.put("errors", validationErrors.toString());
	 
	 return new ResponseEntity<>(errors, headers, httpStatus);
 }
}
