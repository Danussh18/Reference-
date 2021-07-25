package com.cognizant.pattern.singleton.lazy.threads;

public class SingletonPatternTest {

	public static void main(String[] args) {
		MyThread1 ct1 = new MyThread1();
		MyThread2 ct2 = new MyThread2();
		
		ct1.start();
		ct2.start();
	}
}
