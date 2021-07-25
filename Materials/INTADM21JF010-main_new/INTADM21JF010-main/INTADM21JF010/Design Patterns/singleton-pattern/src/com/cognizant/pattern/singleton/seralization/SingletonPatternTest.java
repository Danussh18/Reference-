package com.cognizant.pattern.singleton.seralization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonPatternTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil dateObj1 = DateUtil.getInstance();
		System.out.println(dateObj1.getDate());
		
		ObjectOutputStream oout =new ObjectOutputStream(new FileOutputStream("src/dateUtil.ser"));
		
		oout.writeObject(dateObj1);
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("src/dateutil.ser"));
		
		DateUtil dateObj2 = (DateUtil)oin.readObject();
		System.out.println(dateObj2.getDate());	
		
		System.out.println(dateObj1 == dateObj2); 
		
		System.out.println(dateObj1.hashCode()+"  - "+dateObj2.hashCode());

	}
}
