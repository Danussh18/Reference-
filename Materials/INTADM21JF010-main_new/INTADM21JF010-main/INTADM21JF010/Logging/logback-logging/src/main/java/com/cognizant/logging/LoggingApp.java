package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingApp {
	//create a Logger
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingApp.class.getName());
	
	public static void main(String[] args) {
		LOGGER.info("----- main method execution started ----");
		
		LOGGER.trace("-- This is trace log message --");
		LOGGER.debug("-- This is debug log message --");
		LOGGER.info("-- This is info log message --");
		LOGGER.warn("-- This is warn log message --");
		LOGGER.error("-- This is error log message --");		
		
		int age = 35;
		LOGGER.info("---- My Age is - "+age);
		//---- Parameterized Message ---
		LOGGER.info("---- My Age is - {} ",age);
		
		LOGGER.info("----- main method execution ended -----");		
	}

}
