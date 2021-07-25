package com.cognizant.patterns.abstractpattern;

public class DBDaoFactory extends DaoFactory {
	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type.equalsIgnoreCase("emp"))
			dao = new DBEmployeeDao();
		else if(type.equalsIgnoreCase("dept"))
			dao = new DBDepartmentDao();
		
		return dao;
	}

}
