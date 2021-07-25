package com.cognizant.paymentservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
 @Id
 @GeneratedValue
 private Integer paymentId;
 private String paymentStatus;
 private String transactionId;
 
 private Integer orderId;
 private Float amount;
}
