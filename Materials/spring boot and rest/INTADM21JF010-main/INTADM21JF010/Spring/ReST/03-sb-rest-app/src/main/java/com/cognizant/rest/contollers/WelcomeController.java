package com.cognizant.rest.contollers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
 @GetMapping("/welcome")	
 public String sendWelcomeMsg() {
	 try {
	  Thread.sleep(10000);
	 }catch(Exception ex) {}
	 return "Welcome to REST WebServices";
 }
 
 @GetMapping("/today")
 //public String getToday() {
 public ResponseEntity<String> getToday() {
	 Date d = new Date();
	 SimpleDateFormat simpleFormat = new SimpleDateFormat("dd-MMM-yyy :: hh:mm");
	 String responseData = simpleFormat.format(d);
	 
	 //ResponseEntity<String> entity = new ResponseEntity<>(responseData, HttpStatus.OK);
	 //ResponseEntity<String> entity = new ResponseEntity<>(responseData, HttpStatus.CREATED);
	 //ResponseEntity<String> entity = new ResponseEntity<>(responseData, HttpStatus.ACCEPTED);
	 
	 /*---- to include response headers with ResponseEntity ----*/
	 HttpHeaders responseHeaders = new HttpHeaders();
	 responseHeaders.add("author","Sunil Joseph");
	 responseHeaders.add("company", "CTS");	 
	 
	 ResponseEntity<String> entity = new ResponseEntity<>(responseData, responseHeaders, HttpStatus.ACCEPTED);
	 return entity;
 }
}
