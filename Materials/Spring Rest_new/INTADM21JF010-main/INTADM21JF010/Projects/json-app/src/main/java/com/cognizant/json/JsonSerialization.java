package com.cognizant.json;

import java.io.File;
import java.io.IOException;

import com.cognizant.json.bindings.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class JsonSerialization {

	public static void main(String[] args) throws IOException {
		Customer customer = new Customer(); 
		customer.setCustomerId(101234L);
		customer.setCustomerName("Praveen Kumar");
		customer.setCustomerEmail("praveen@gmail.com");
		
		System.out.println(customer);
		
		ObjectMapper objMapper = new ObjectMapper();
		
		//---to convert Customer instance to JSON String
		String customerInJson = objMapper.writeValueAsString(customer);		
		System.out.println(customerInJson);
		
		ObjectWriter objWriter = objMapper.writerWithDefaultPrettyPrinter();
		customerInJson = objWriter.writeValueAsString(customer);
		System.out.println(customerInJson);
		
		//--to convert Customer instance to JSON and to write to a file
		//objMapper.writeValue(new File("target/customer.json"), customer);
		objMapper.writerWithDefaultPrettyPrinter()
				 .writeValue(new File("target/customer.json"), customer);
	}
}
