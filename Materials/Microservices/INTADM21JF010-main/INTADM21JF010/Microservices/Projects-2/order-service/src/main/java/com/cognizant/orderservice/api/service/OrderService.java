package com.cognizant.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cognizant.orderservice.api.entity.Order;
import com.cognizant.orderservice.api.modal.Payment;
import com.cognizant.orderservice.api.modal.TransactionRequest;
import com.cognizant.orderservice.api.modal.TransactionResponse;
import com.cognizant.orderservice.api.repository.OrderRepository;

@Service
public class OrderService {
 @Autowired	
 private OrderRepository orderRepo;
 
 @Autowired
 private RestTemplate template;
 
 public TransactionResponse saveOrder(TransactionRequest request) {
	 Order order = request.getOrder();
	 order = orderRepo.save(order);
	 
	 Payment payment = request.getPayment();
	 payment.setOrderId(order.getOrderId());
	 payment.setAmount(order.getAmount());
	 
	 //do a ReST call to make the payment -Payment Service
	 //String restEndPoint = "http://localhost:9092/payment/dopayment";
	 String restEndPoint = "http://PAYMENT-SERVICE/payment/dopayment";
	 Payment paymentResponse = template.postForObject(restEndPoint, payment, Payment.class);
	 
	 String orderPlacingStatus = "";
	 String paymentStatus = paymentResponse.getPaymentStatus();
	 
	 if(paymentStatus.equals("success"))
		  orderPlacingStatus = "Payment is Successful!, we will dispatch the order soon, You can tract it from our web site";
	 else
		 orderPlacingStatus = "Payment Failed, Please contact our customer care for support!";
	 
	 
	 
	 TransactionResponse txReponse = new TransactionResponse();
	 txReponse.setOrder(order);
	 txReponse.setMessage(orderPlacingStatus);
	 txReponse.setTransactionId(paymentResponse.getTransactionId());
	 
	 return txReponse;
 }
}
