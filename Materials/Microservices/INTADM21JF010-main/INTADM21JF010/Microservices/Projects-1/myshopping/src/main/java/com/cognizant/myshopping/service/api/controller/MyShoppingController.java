package com.cognizant.myshopping.service.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyShoppingController {
  @Autowired	
  RestTemplate template;
  
  @Autowired
  DiscoveryClient client;
  
  @GetMapping("/myshopping")
  public String doShopping() {
	  //select items and calculate the total cost
	  int totalCost = 2500;
	  
	  //String endPoint = "http://localhost:9091/order-now/"+totalCost;
	  //String endPoint = "http://ORDER-SERVICE/order-now/"+totalCost;
	  //String response = template.getForObject(endPoint, String.class);
	  
	  String endPoint = "http://ORDER-SERVICE/order-now/{amount}";
	  Map<String, Integer> params = new HashMap<>();
	  params.put("amount", totalCost);
	  String response = template.getForObject(endPoint, String.class, params);
	  
	  List<ServiceInstance> listInstances = client.getInstances("ORDER-SERVICE");	  
	  System.out.println("----------" + listInstances.size());
	  
	  return response+" - "+listInstances.size()+" - "+ listInstances.get(0).getHost()+" - "+listInstances.get(0).getPort()+" - "+listInstances.get(0).getUri();
  }
  
  @GetMapping("/showproducts")
  public List<String> showProducts(){
	  List<String> products = template.getForObject("http://ORDER-SERVICE/products/all", List.class);
	  return products;
  }
}
