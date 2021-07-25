package com.cognizant.patterns.abstractpattern;

public class DBDepartmentDao extends Dao {
	@Override
	public void save() {
		System.out.println("--- Department is being saved in Database ---");
	}

}
