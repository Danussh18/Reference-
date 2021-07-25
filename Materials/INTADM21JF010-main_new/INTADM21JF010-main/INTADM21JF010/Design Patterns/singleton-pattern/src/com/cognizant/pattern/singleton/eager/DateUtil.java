package com.cognizant.pattern.singleton.eager;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
 private static DateUtil instance = new DateUtil();
 
 private DateUtil() {
	 System.out.println("--- creating instance ----");
 }
 
 public static DateUtil getInstance() {
	 return instance;
 }
 
 public String getDate() {
	 Date today = new Date();
	 SimpleDateFormat sFormat = new SimpleDateFormat("dd-MMM-yyyy");
	 return sFormat.format(today);
 }
}
