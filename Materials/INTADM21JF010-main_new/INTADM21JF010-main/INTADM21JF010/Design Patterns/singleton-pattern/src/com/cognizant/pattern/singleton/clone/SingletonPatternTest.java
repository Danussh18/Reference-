package com.cognizant.pattern.singleton.clone;

public class SingletonPatternTest {

	public static void main(String[] args){
		DateUtil dateObj1 = DateUtil.getInstance();
		System.out.println(dateObj1.getDate());

		try {
			DateUtil dateObj2 = (DateUtil) dateObj1.clone();
			System.out.println(dateObj2.getDate());

			System.out.println(dateObj1 == dateObj2);

			System.out.println(dateObj1.hashCode() + "  - " + dateObj2.hashCode());
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
