package com.cognizant.paymentservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.paymentservice.api.entity.Payment;
import com.cognizant.paymentservice.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService service;
	
	@PostMapping("/dopayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return service.doPayment(payment);
	}
	
	@GetMapping("/getorder/{orderid}")
	public Payment searchPaymentByOrderId(@PathVariable Integer orderid) {
		return service.getPaymentByOrderId(orderid);
	}
}
