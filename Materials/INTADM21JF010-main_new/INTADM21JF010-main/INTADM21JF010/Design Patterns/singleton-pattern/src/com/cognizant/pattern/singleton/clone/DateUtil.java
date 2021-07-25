package com.cognizant.pattern.singleton.clone;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil implements Cloneable{
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
	
	@Override
	protected Object clone()throws CloneNotSupportedException{
		//return super.clone();
		throw new CloneNotSupportedException("Cloning is not supported for Singleton Object!");
	}
}
