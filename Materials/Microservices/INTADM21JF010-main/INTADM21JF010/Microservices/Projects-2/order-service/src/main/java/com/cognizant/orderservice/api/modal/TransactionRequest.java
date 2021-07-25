package com.cognizant.orderservice.api.modal;

import com.cognizant.orderservice.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
 private Order order;
 private Payment payment;
}
