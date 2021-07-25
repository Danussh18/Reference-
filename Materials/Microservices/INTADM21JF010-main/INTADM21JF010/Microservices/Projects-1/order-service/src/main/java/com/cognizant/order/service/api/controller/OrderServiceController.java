package com.cognizant.order.service.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {
 @GetMapping("/order-now/{amount}")	
 public String orderNow(@PathVariable Integer amount) {
	 //logic to do the payment using 3rd party payment gateways like Paytm, Bill Desk etc
	 String responseMsg = "Payment of Rs. "+amount+" is done and your order will be dispatched in 2 days time!";
	 return responseMsg;
 }
 
 @GetMapping("/products/all")
 public List<String> getProducts(){
	 List<String> products = Arrays.asList("Mouse","Keyboard","Processor","RAM","Hard Disk", "Cabinet");
	 return products;
 }
}
