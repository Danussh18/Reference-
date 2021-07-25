package com.cognizant.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

class ReportGenerator{
	private static final Logger LOGGER = Logger.getLogger(ReportGenerator.class.getName());
	void generateReport() {
		LOGGER.setLevel(Level.WARNING);
		
		LOGGER.log(Level.INFO, "---- generateReport method execution started ----");
		//logic to generate report
		LOGGER.log(Level.WARNING, "---- generateReport method execution ended ----");
	}
}
public class JavaLoggingTest {
	//-- create a Logger
	private static final Logger LOGGER = Logger.getLogger(JavaLoggingTest.class.getName()); 
	public static void main(String[] args) {
		LOGGER.log(Level.INFO, "--- main method execution started ----");
		
		ReportGenerator reportGenObj = new ReportGenerator();
		reportGenObj.generateReport();
		
		LOGGER.log(Level.INFO, "--- main method execution endeded ----");
		
		LOGGER.log(Level.INFO, "-----------------------------");
		
		LOGGER.setLevel(Level.INFO);
		LOGGER.severe("----- Severe Log Message -----");
		LOGGER.warning("----- Warning Log Message -----");
		LOGGER.info("----- Info Log Message -----");
		LOGGER.config("----- Config Log Message -----");
		LOGGER.fine("----- Fine Log Message -----");
		LOGGER.finest("----- Finest Log Message -----");
	}
}
