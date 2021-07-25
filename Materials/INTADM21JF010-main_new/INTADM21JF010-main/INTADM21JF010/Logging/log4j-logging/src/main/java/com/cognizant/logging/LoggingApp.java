package com.cognizant.logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggingApp {
	//create a Logger
	private static final Logger LOGGER = Logger.getLogger(LoggingApp.class);
	
	public static void main(String[] args) {
		//using the BasicConfiguration
		BasicConfigurator.configure();
		
		LOGGER.setLevel(Level.INFO);
		LOGGER.info("----- main method execution started ----");
		
		LOGGER.trace("-- This is trace log message --");
		LOGGER.debug("-- This is debug log message --");
		LOGGER.info("-- This is info log message --");
		LOGGER.warn("-- This is warn log message --");
		LOGGER.error("-- This is error log message --");
		LOGGER.fatal("-- This is fatal log message --");
		
		LOGGER.info("----- main method execution ended -----");		
		System.out.println("--- main method ends ----");
		String name="Sunil";
	}
	
	public static void testMethod() {
		System.out.println("-- inside test method ----");
	}

}
