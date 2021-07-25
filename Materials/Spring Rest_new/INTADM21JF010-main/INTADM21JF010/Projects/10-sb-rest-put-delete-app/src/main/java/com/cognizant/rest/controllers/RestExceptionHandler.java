package com.cognizant.rest.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cognizant.rest.bindings.ApiError;
import com.cognizant.rest.exceptions.UserNotFoundException;

@RestController
@RestControllerAdvice
public class RestExceptionHandler {
 @ExceptionHandler(value = UserNotFoundException.class)	
// public ResponseEntity<String> handleUserNotFoundException(){
 public ResponseEntity<ApiError> handleUserNotFoundException(UserNotFoundException ex){	 
	 //return new ResponseEntity<>("User Not Found", HttpStatus.BAD_REQUEST);
	 ApiError error = new ApiError();
	 error.setErrorCode(502);
	 error.setErrorMsg(ex.getMessage());
	 error.setErrorDate(new Date());
	 
	 return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
 }
}
