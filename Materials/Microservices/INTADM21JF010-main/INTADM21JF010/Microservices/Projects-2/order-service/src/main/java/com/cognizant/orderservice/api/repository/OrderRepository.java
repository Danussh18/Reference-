package com.cognizant.orderservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.orderservice.api.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
