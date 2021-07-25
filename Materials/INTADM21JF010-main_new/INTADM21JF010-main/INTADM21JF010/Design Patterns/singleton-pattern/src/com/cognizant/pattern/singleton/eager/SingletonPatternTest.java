package com.cognizant.pattern.singleton.eager;

import com.cognizant.pattern.singleton.lazy.threads.DateUtil;

public class SingletonPatternTest {

	public static void main(String[] args) {
		DateUtil dateObj = DateUtil.getInstance();
		System.out.println(dateObj.getDate());
		
		DateUtil dateObj1 = DateUtil.getInstance();
		System.out.println(dateObj1.getDate());
		
		DateUtil dateObj2 = DateUtil.getInstance();
		System.out.println(dateObj2.getDate());
		
		System.out.println(dateObj == dateObj1);
		System.out.println(dateObj.hashCode() + " | "+dateObj1.hashCode()+" | "+dateObj2.hashCode());		
	}
}
