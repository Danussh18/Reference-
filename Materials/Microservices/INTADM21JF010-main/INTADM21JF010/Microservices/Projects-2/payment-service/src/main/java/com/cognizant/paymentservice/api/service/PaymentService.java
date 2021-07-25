package com.cognizant.paymentservice.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.paymentservice.api.entity.Payment;
import com.cognizant.paymentservice.api.repository.PaymentRepository;

@Service
public class PaymentService {
 @Autowired
 private PaymentRepository paymentRepo;
 
 public Payment doPayment(Payment payment) {
	 payment.setTransactionId(UUID.randomUUID().toString());
	 payment.setPaymentStatus(paymentProcessing());
	 return paymentRepo.save(payment);
 }
 
 private String paymentProcessing() {
	 //api should be using 3rd part payment gateways
	 String status = new Random().nextBoolean()?"success":"failed";
	 return status;
 }

public Payment getPaymentByOrderId(Integer oid) {	
	return paymentRepo.findByOrderId(oid);
}
}
