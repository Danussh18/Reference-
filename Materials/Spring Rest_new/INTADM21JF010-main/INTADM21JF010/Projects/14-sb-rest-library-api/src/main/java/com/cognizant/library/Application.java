package com.cognizant.library;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.cognizant.library.entity.Book;
import com.cognizant.library.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Profile("production")
	@Bean
	CommandLineRunner initDatabase(BookRepository bookRepo) {		
		return args -> {
			bookRepo.save(new Book("Spring Boot With Microservices","Sunil Joseph",new BigDecimal(325.5)));
			bookRepo.save(new Book("Java Complete Reference","James Ghosling",new BigDecimal(750.50)));
			bookRepo.save(new Book("Hibernate - an Ultimate Guide","Patrick Naughtan",new BigDecimal(500)));
		};
	}
}
