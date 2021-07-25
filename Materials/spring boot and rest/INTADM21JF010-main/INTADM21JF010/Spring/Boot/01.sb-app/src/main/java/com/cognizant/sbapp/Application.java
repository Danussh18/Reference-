package com.cognizant.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cognizant.sbapp.beans.Engine;
import com.cognizant.sbapp.beans.util.PasswordEncryptor;

@SpringBootApplication
@ComponentScan(basePackages = {"co.cognizant","com.cognizant"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Engine eng = context.getBean(Engine.class);
		eng.start();
		
		eng = context.getBean("engine", Engine.class);
		eng.start();
		
		//PasswordEncryptor pwdEncryptor =  context.getBean(PasswordEncryptor.class);
		PasswordEncryptor pwdEncryptor =  (PasswordEncryptor) context.getBean("security");
		String pwd = "12345";
		String encPwd = pwdEncryptor.encryptPassword(pwd);
		System.out.println("Encrypted Password = " + encPwd);
	}

}
