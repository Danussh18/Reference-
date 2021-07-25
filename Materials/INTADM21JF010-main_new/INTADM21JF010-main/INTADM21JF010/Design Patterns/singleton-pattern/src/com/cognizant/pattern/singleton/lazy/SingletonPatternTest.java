package com.cognizant.pattern.singleton.lazy;

public class SingletonPatternTest {

	public static void main(String[] args) {
		DateUtil dateObj = DateUtil.getInstance();
		System.out.println(dateObj.getDate());
	}
}
