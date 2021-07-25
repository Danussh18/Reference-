package com.cognizant.patterns.abstractpattern;

public class DBEmployeeDao extends Dao {
	@Override
	public void save() {
		System.out.println("--- Employee is being saved in Database ---");
	}
}
