package com.cognizant.sbapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine eng;
	
	public void drive() {
		Integer status = eng.start();
		if (status == 0)
			System.out.println("--- Journey Started ----");
		else
			System.out.println("--- Starting trouble for Engine ---");
	}
}
