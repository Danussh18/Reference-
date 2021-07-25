package com.cognizant.orderservice.api.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
 private Integer paymentId;
 private String paymentStatus;
 private String transactionId;
 private Integer orderId;
 private Float amount;
}
