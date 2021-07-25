package com.cognizant.sbapp.configs;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cognizant.sbapp.beans.util.PasswordEncryptor;

@Configuration
public class AppConfig {
 public AppConfig() {
	 System.out.println("**** AppConfig :: Constructor ****");
 }
 //@Bean
 @Bean(name = {"encryptor","security"})
 public PasswordEncryptor getPwdEncryptorInstance() {
	 PasswordEncryptor pwdObj = new PasswordEncryptor();
	 return pwdObj;
 }

}
