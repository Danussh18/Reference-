package com.cognizant.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
 @RequestMapping("/welcome")	
 public String sendWelcomeMessage() {
	 String responseMsg = " Welcome to Cognizant!";
	 return responseMsg;
 }
}
