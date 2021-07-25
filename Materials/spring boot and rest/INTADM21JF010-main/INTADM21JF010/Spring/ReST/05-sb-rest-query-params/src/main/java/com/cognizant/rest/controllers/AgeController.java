package com.cognizant.rest.controllers;

import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class AgeController { 
 @RequestMapping("/age")
 public ResponseEntity<String> getAge(@RequestParam("yob") Integer yob){
	 if(isValidYearOfBirth(yob)) {
		 int age = calculateAge(yob);
		 return new ResponseEntity<String>("Your Age is "+age, HttpStatus.OK);
	 }else {
		 return new ResponseEntity<String>("Year of Birth is Not Valid", HttpStatus.BAD_REQUEST);
	 }
 }

private boolean isValidYearOfBirth(Integer yob) {
	int currentYear = Calendar.getInstance().get(Calendar.YEAR);	
	return (yob<currentYear)?true:false;
}
private int calculateAge(Integer yob) {
	Calendar calendar = Calendar.getInstance();
	int currentYear = calendar.get(Calendar.YEAR);	
	return currentYear-yob;
}
}
