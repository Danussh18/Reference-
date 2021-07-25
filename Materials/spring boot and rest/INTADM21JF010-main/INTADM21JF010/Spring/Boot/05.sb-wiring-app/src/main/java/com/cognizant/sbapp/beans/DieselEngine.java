package com.cognizant.sbapp.beans;

import org.springframework.stereotype.Component;

//@Component
@Component("de")
public class DieselEngine implements Engine {

	@Override
	public Integer start() {
		System.out.println("**** Diesel Engine :: start() Method ****");
		return 0;
	}

}
