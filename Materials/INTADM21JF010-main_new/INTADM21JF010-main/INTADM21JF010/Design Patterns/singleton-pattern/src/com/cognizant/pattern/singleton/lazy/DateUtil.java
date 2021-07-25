package com.cognizant.pattern.singleton.lazy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static DateUtil instance = null;

	private DateUtil() {}

	public static DateUtil getInstance() {
		if(instance == null) {
			System.out.println("--- creating instance ----");
			instance = new DateUtil();
		}
		return instance;
	}

	public String getDate() {
		Date today = new Date();
		SimpleDateFormat sFormat = new SimpleDateFormat("dd-MMM-yyyy");
		return sFormat.format(today);
	}
}
