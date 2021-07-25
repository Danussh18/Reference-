package com.cognizant.orderservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORDER_TBL")
public class Order {
 @Id
 @GeneratedValue
 private Integer orderId;
 private String productName;
 private Integer quantity;
 private Float amount;
}
