package com.cognizant.sbapp.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("c")
public class A {
 public A() {
	 System.out.println("**** A :: Constructor ****");
 }
}
