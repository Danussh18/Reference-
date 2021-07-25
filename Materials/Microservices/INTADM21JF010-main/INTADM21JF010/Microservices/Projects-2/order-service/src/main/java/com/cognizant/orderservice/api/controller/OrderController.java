package com.cognizant.orderservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orderservice.api.entity.Order;
import com.cognizant.orderservice.api.modal.Payment;
import com.cognizant.orderservice.api.modal.TransactionRequest;
import com.cognizant.orderservice.api.modal.TransactionResponse;
import com.cognizant.orderservice.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
 @Autowired	
 private OrderService service;	
 @PostMapping("/bookorder")
 public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {	 
	 return service.saveOrder(request);
 }
}
