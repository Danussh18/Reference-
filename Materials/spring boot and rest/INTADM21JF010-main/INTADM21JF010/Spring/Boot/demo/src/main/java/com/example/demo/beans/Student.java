package com.example.demo.beans;

public class Student {
	private String name;

	public Student() {
		System.out.println("--- Student class zero argument constructor ----");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("--- Student class one argument constructor ----");
	}

	public String getName() {
		//System.out.println("--- getName() method ----");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("--- setName() method ----");
	}

	@Override
	public String toString() {
		return "Student [" + name + "]";
	}
	
	public void myInit_1() {
		System.out.println("---User-defined initialization method - 1 ---");
	}
	public void myInit_2() {
		System.out.println("---User-defined initialization method - 2 ---");
	}	
	public void myDestroy() {
		System.out.println("---User-defined destructor ---");
	}	
}
