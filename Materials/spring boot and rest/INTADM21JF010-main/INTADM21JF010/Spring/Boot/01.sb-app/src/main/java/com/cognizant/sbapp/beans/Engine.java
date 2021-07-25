package com.cognizant.sbapp.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("engine")
@Component(value = "engine")
//@Scope("prototype")
public class Engine {
	public Engine() {		
		System.out.println("**** Engine :: Constructor ****");
	}
	public void start() {
		System.out.println("--- starting engine ---");
	}
}
