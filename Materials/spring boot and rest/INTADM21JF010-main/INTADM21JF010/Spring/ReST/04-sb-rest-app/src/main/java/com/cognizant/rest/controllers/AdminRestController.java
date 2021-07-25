package com.cognizant.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
 @GetMapping	
 public void readHeaders(@RequestHeader("Host") String host, @RequestHeader(value = "department", required = false, defaultValue = "HR") String department, @RequestBody String dataFromClient) {
	 System.out.println("Host = " + host);
	 System.out.println("Department Name = " + department);
	 System.out.println("Request Data = " + dataFromClient);
 }
}
