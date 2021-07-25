package com.cognizant.orderservice.api.modal;

import com.cognizant.orderservice.api.entity.Order;

import lombok.Data;

@Data
public class TransactionResponse {
 private Order order;
 private String message;
 private String transactionId;
}
