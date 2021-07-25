package com.cognizant.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilScoreRestController {
 @GetMapping("/score")
// public ResponseEntity<String> getCibilScoreForPan(@RequestParam("pan") String pan){
 public ResponseEntity<String> getCibilScoreForPan(@RequestParam(value = "pan", required = false, defaultValue = "XXXXX") String pan){
	 //logic for getting cibil Score
	 String score = "Not a Valid PAN (or) PAN is NOT Submitted";
	 if(!(pan.equals("XXXXX")))
		 score = "CIBIL Score for "+pan+": 812";
	 
	 ResponseEntity<String> responseEntity = new ResponseEntity<>(score, HttpStatus.OK);
	 return responseEntity;
 }
}
