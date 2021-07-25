package com.cognizant.rest.consumer;


import java.util.HashMap;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

public class ConsumerTest {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();		
		
		String restAPI = "http://localhost:9090/welcome";
		/*
		ResponseEntity<String> responseEntity = rt.getForEntity(restAPI, String.class);

		if(responseEntity.getStatusCode() == HttpStatus.OK) {
			String responseBody = responseEntity.getBody();
			System.out.println(responseBody);
		}
		
		System.out.println("---- done ----");
		*/
		
		
		WebClient webClient = WebClient.
                create("http://localhost:9090/welcome");
        
        String response = webClient.get()
        		 				   .retrieve()
        		 				   .bodyToMono(String.class)
        		 				   .block();
        System.out.println(response);
	}
}
