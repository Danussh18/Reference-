package com.cognizant.pattern.singleton.lazy.threads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static volatile DateUtil instance = null;

	private DateUtil() {}
/*
	public static DateUtil getInstance() {
		if(instance == null) {
			System.out.println("--- creating instance ----");
			instance = new DateUtil();
		}
		return instance;
	}
*/
/*	
	public static DateUtil getInstance() {
	 synchronized(DateUtil.class){	
		if(instance == null) {
			System.out.println("--- creating instance ----");
			instance = new DateUtil();
		}
	 }	
	 return instance;
	}
*/
	/*---- double level check for the condition ---*/
	public static DateUtil getInstance() {
		if(instance == null) {
		 synchronized(DateUtil.class) {	
		  if(instance == null ) {	 
			System.out.println("--- creating instance ----");
			instance = new DateUtil();
		  }	
		 }	
		}
		return instance;
	}
	
	public String getDate() {
		Date today = new Date();
		SimpleDateFormat sFormat = new SimpleDateFormat("dd-MMM-yyyy");
		return sFormat.format(today);
	}
}
