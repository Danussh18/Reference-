package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.beans.Student;

@SpringBootApplication
@ImportResource({"classpath:beans.xml"})
//@ImportResource({"beans.xml","country.xml"})
public class DemoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	/*
	public static void main(String[] args) {
		LOGGER.debug("--- main method starts ---");
		SpringApplication.run(DemoApplication.class, args);	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student st1 = (Student)context.getBean("stud1");
		//System.out.println(st1);
		LOGGER.info(st1.toString());
		Student st2 = (Student)context.getBean("stud2");
		//System.out.println(st2);
		LOGGER.info(st2.toString());
		LOGGER.info("--- main method ends ---");
	}
	*/
	public static void main(String[] args) {
		LOGGER.debug("--- main method starts ---");
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);	
			
		Student st1 = (Student)context.getBean("stud1");
		//System.out.println(st1);
		LOGGER.info(st1.toString());
		Student st2 = (Student)context.getBean("stud2");
		//System.out.println(st2);
		LOGGER.info(st2.toString());
		
		Student st3 = (Student)context.getBean("stud1");
		LOGGER.info(st3.toString());
		
		Student st4 = context.getBean("stud1", Student.class);
		LOGGER.info(st4.toString());		
		
		System.out.println(st1.hashCode()+" - "+st3.hashCode()+" - "+st4.hashCode());
		
		List<Student> students = context.getBean("studentsList", ArrayList.class);
		for(Student st : students) {
			LOGGER.info(st.getName());
		}
		LOGGER.info("--- main method ends ---");
	}	
}
