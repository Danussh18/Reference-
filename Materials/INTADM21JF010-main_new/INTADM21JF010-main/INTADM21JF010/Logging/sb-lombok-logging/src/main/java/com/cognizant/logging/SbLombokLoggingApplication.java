package com.cognizant.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SbLombokLoggingApplication {	
	
	public static void main(String[] args) {
		SpringApplication.run(SbLombokLoggingApplication.class, args);
		log.info("---- info message ----");
		log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
	}

}
