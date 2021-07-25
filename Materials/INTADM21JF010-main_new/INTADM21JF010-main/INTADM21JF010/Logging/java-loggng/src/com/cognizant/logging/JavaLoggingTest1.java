package com.cognizant.logging;

import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLoggingTest1 {
	//-- create a Logger
	private static Logger LOGGER = null; 
	static{
		InputStream stream = JavaLoggingTest1.class.getClassLoader().getResourceAsStream("logging.properties");
		try {
			LogManager.getLogManager().readConfiguration(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER = Logger.getLogger(JavaLoggingTest1.class.getName());
	}
 
	public static void main(String[] args) {
		LOGGER.severe("----- Severe Log Message -----");
		LOGGER.warning("----- Warning Log Message -----");
		LOGGER.info("----- Info Log Message -----");		
	}
}

