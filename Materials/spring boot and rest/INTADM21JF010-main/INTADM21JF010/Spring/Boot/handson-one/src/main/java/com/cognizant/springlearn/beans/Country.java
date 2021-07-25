package com.cognizant.springlearn.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;

@Data
public class Country {
 private String code;
 private String name;
 private static final Logger logger = LoggerFactory.getLogger(Country.class);
 
 public Country() {
   logger.info("Inside Country Constructor");	 
 }

@Override
public String toString() {
	return "Country ["+ code + " ---> " + name + "]";
}
 
}
