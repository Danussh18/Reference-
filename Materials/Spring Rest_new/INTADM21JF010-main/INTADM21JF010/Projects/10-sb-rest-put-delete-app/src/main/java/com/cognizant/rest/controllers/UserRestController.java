package com.cognizant.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.rest.bindings.User;
import com.cognizant.rest.exceptions.UserNotFoundException;

@RestController
@RequestMapping("/users")
public class UserRestController {
 @PutMapping(value = "/update",
		 	 consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
		 	)
 public ResponseEntity<String> updateUser(@RequestBody User user){
	 System.out.println(user);
	 //logic to update the user (userName, userEmail) based on the userId
	 String msg = "User record Updated";
	 return new ResponseEntity<String>(msg, HttpStatus.OK);
 }
 
 @DeleteMapping(value = "/delete/{uid}")
 public ResponseEntity<String> deleteUserByUserId(@PathVariable("uid") Integer uid){
	 System.out.println("Deleting user with User Id: " + uid);
	 if(uid > 100)
		 throw new UserNotFoundException("User ID: "+uid);
	 
	 //logic to delete user with User Id: uid
	 return new ResponseEntity<String>("User with user Id: "+ uid+" Deleted Successfully!", HttpStatus.ACCEPTED);
 }
}
