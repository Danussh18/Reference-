package com.cognizant.patterns.abstractpattern;

public class XMLEmployeeDao extends Dao {
	@Override
	public void save() {
		System.out.println("--- Employee is being saved in XML File ---");
	}
}
