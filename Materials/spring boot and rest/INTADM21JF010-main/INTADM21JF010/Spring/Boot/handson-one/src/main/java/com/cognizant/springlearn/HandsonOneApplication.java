package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.cognizant.springlearn.beans.Country;

@SpringBootApplication
@ImportResource("country.xml")
public class HandsonOneApplication {
	private static final Logger logger = LoggerFactory.getLogger(Country.class);
	private static ApplicationContext context = null;
		
	public static void main(String[] args) {
		context = SpringApplication.run(HandsonOneApplication.class, args);		
		displayCountry();
		logger.info("------ HANDSON - 01 | 03");
		displayCountries();
		
		displayDate();
	}

	private static void displayCountry() {		
		Country country = (Country)context.getBean("country");		
		logger.info(country.getCode()+" ---> "+country.getName());
	}
	
	private static void displayCountries() {
		logger.info("----Displaying all Country Codes with their Names----");
		List<Country> countries = (List)context.getBean("countryList");
		for(Country country : countries) {
			logger.info(country.getCode()+" ----> "+country.getName());
		}
	}
	
	private static void displayDate() {
		SimpleDateFormat format = (SimpleDateFormat)context.getBean("dateFormat");
		System.out.println(format.format(new Date()));
	}
}
