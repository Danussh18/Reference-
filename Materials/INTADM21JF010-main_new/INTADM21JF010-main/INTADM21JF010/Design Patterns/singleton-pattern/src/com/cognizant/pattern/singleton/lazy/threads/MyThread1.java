package com.cognizant.pattern.singleton.lazy.threads;

public class MyThread1 extends Thread{
 public void run() {
	 DateUtil dateUtil = DateUtil.getInstance();
	 System.out.println("hashCode = "+ dateUtil.hashCode());
	 System.out.println(Thread.currentThread().getName()+" : "+dateUtil.getDate());
 }
}
