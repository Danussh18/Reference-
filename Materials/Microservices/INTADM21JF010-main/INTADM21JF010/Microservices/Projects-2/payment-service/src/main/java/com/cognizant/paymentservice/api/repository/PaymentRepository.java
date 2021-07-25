package com.cognizant.paymentservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.paymentservice.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	Payment findByOrderId(Integer oid);

}
