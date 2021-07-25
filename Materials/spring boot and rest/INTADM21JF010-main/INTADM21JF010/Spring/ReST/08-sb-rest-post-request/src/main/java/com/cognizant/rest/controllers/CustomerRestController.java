package com.cognizant.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.rest.bindings.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
 @PostMapping(
		 		value = "/add",
		 		consumes = {"application/json","application/xml"}
		 	)	
 public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
	 System.out.println(customer);
	 //---save customer data in DB
	 return new ResponseEntity<String>("Customer Added Successfully", HttpStatus.CREATED);
 }
}
