package com.cognizant.rest.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
 //@RequestMapping("/welcome")	
 //@RequestMapping(value = "/welcome", method = RequestMethod.GET)
 @GetMapping("/welcome")
 public String sendWelcomeMsgGet() {
	 return "Welcome to Cognizant - GET";
 }
 @PostMapping("/welcome")
 public String sendWelcomeMsgPost() {
	 return "Welcome to Cognizant - POST";
 } 
 @PutMapping("/welcome")
 public String sendWelcomeMsgPut() {
	 return "Welcome to Cognizant - PUT";
 } 
 @DeleteMapping("/welcome")
 public String sendWelcomeMsgDelete() {
	 return "Welcome to Cognizant - Delete";
 }
 @PatchMapping("/welcome")
 public String sendWelcomeMsgPatch() {
	 return "Welcome to Cognizant - Patch";
 }
}
