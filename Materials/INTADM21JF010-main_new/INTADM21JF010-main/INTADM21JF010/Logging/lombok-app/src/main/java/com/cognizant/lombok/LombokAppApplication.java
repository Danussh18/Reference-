package com.cognizant.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.lombok.model.Product;

@SpringBootApplication
public class LombokAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokAppApplication.class, args);
		
		Product product = new Product();
		System.out.println(product.getProductId()+" | "+ product.getProductName()+" | "+ product.getProductPrice());
		
		//product.setProductName(null); // java.lang.NullPointerException: productName is marked non-null but is null
		System.out.println(product); //toString()
		
		Product product1 = new Product(101L, "Monitor", 7500f);
		System.out.println(product1);
		
		Product product2 = new Product(102L, "Keyboard");
		System.out.println(product2);
		
		Product product3 = new Product();
		product3.setProductId(103L);
		product3.setProductName("Mouse");
		product3.setProductPrice(250.75f);
		System.out.println(product3);
		
		Product product4 = Product.builder()
								.productId(104L)
								.productName("Processor")
								.productPrice(9250f)
								.build();
		System.out.println(product4.getProductId()+" | "+product4.getProductName()+" | "+product4.getProductPrice());
		
		
		Product.ProductBuilder prodBuilder = Product.builder();
		prodBuilder.productId(105L)
		           .productName("Cabinet")
		           .productPrice(2500f);
		Product product5 = prodBuilder.build();
		System.out.println(product5);
		
	}

}
