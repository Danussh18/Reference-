package com.cognizant.sbapp.beans.util;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordEncryptor {
 public PasswordEncryptor() {
	 System.out.println("**** PasswordEncryptor :: Constructor ****");
 }
 
 
 public String encryptPassword(String pwd) {
	 Encoder encoder = Base64.getEncoder();
	 String encodedPwd = encoder.encodeToString(pwd.getBytes());
	 return encodedPwd;
 } 
}
