package com.cognizant.patterns.abstractpattern;

public class XMLDaoFactory extends DaoFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type.equalsIgnoreCase("emp"))
			dao = new XMLEmployeeDao();
		else if(type.equalsIgnoreCase("dept"))
			dao = new XMLDepartmentDao();
		
		return dao;
	}

}
