package com.cognizant.rest.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		RestTemplate rt = new RestTemplate();
		
		/*
		String restAPI = "http://localhost:9090/welcome";
		
		ResponseEntity<String> responseEntity = rt.getForEntity(restAPI, String.class);

		if(responseEntity.getStatusCode() == HttpStatus.OK) {
			String responseBody = responseEntity.getBody();
			System.out.println(responseBody);
		}
		*/
		
		String restAPI = "http://localhost:9090/library/book";
		
		HttpHeaders requestHeaders = new HttpHeaders();
		//requestHeaders.set("Accept", "application/xml");
		requestHeaders.set("Accept", "application/json");
		
		HttpEntity<String> requestEntity = new HttpEntity<>(requestHeaders);
		
		ResponseEntity<String> responseEntity = rt.exchange(restAPI, HttpMethod.GET, requestEntity, String.class);

		System.out.println(responseEntity.getBody());
	}

}
