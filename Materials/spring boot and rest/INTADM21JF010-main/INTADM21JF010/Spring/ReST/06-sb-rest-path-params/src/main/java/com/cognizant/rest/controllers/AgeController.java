package com.cognizant.rest.controllers;

import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal")
public class AgeController { 
 @RequestMapping("/age/{name}/{yob}")
 public ResponseEntity<String> getAge(@PathVariable String name, @PathVariable("yob") Integer yob){
	 if(isValidYearOfBirth(yob)) {
		 int age = calculateAge(yob);
		 return new ResponseEntity<String>(name+"'s Age is "+age, HttpStatus.OK);
	 }else {
		 return new ResponseEntity<String>(name+", your Year of Birth is Not Valid", HttpStatus.BAD_REQUEST);
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
