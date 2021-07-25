package com.cognizant.json;

import java.io.File;
import java.io.IOException;

import com.cognizant.json.bindings.Customer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserialization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		File jsonSource = new File("target/customer.json");
		if(jsonSource.exists()) {
			//--to De-serialize a JSON Object
			ObjectMapper objMapper = new ObjectMapper();
			Customer customer = objMapper.readValue(jsonSource, Customer.class);
			
			System.out.println(customer);
			System.out.println(customer.getCustomerName());
			
			String jsonData = "{\"cid\":101234,\"name\":\"Praveen Kumar\",\"email\":\"praveen@gmail.com\"}";
			customer = objMapper.readValue(jsonData, Customer.class);
			System.out.println(customer);
		}else {
			System.out.println("The JSON Source is not present!");
		}

	}

}
