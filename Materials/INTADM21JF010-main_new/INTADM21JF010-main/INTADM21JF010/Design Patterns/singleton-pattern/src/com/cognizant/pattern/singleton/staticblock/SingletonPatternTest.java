package com.cognizant.pattern.singleton.staticblock;


public class SingletonPatternTest {

	public static void main(String[] args) {
		DateUtil dateObj1 = DateUtil.getInstance();
		System.out.println(dateObj1.getDate());
		
		DateUtil dateObj2 = DateUtil.getInstance();
		System.out.println(dateObj2.getDate());	
		
		System.out.println(dateObj1 == dateObj2); //true
		
		System.out.println(dateObj1.hashCode()+"  - "+dateObj2.hashCode());
	}
}
