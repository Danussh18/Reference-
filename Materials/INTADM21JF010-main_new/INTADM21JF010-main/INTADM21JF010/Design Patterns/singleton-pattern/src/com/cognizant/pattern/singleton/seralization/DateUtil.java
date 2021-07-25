package com.cognizant.pattern.singleton.seralization;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static DateUtil instance = null;
	
	static {
		System.out.println("--- creating instance in static block ---");
		instance = new DateUtil();
	}
	private DateUtil() {}

	public static DateUtil getInstance() {
		return instance;
	}

	public String getDate() {
		Date today = new Date();
		SimpleDateFormat sFormat = new SimpleDateFormat("dd-MMM-yyyy");
		return sFormat.format(today);
	}
	
	protected Object readResolve(){
		System.out.println("--- inside readResolve() method ----");
		return instance;
	}
}
