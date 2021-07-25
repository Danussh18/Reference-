package com.cognizant.sbapp.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
@Component("pe")
//@Primary
public class PetrolEngine implements Engine {
	
	@Override
	public Integer start() {
		System.out.println("**** Petrol Engine :: start() Method ****");
		return 0;
	}

}
