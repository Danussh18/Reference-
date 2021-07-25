package com.cognizant.sbapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Car {
 @Autowired	
 //@Qualifier("petrolEngine")
 //@Qualifier("dieselEngine")
 @Qualifier("pe")
 private Engine eng;
 
 public void drive() {
	 System.out.println("**** Car :: drive() method");
	 Integer n = eng.start();
	 if(n == 0)
		 System.out.println("**** Journey Started ****");
	 else
		 System.out.println("#### Starting Trouble ####");
 }
}
