package com.cognizant.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.sbapp.beans.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		//Car car = context.getBean(Car.class);
		Car car = (Car)context.getBean("car");
		car.drive();
	}

}
