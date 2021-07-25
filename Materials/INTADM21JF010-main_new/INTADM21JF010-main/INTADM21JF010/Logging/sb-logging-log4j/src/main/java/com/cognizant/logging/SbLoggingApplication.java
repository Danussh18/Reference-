package com.cognizant.logging;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbLoggingApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SbLoggingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SbLoggingApplication.class, args);
		LOGGER.info("---- inside static void main method ---");
	}

}
