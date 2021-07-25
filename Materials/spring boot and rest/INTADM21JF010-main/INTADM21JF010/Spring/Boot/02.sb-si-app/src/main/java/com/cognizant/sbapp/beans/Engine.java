package com.cognizant.sbapp.beans;

import org.springframework.stereotype.Component;
@Component
public class Engine {
	public Engine() {		
		System.out.println("**** Engine :: Constructor ****");
	}
	public Integer start() {
		//logic to start car
		return 0;
	}
}
