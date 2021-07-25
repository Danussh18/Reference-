package com.cognizant.patterns.abstractpattern;

public class XMLDepartmentDao extends Dao {
	@Override
	public void save() {
		System.out.println("--- Department is being saved in XML File ---");
	}
}
