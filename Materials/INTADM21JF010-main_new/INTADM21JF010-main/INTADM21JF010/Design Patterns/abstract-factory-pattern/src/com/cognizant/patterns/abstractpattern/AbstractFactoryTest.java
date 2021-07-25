package com.cognizant.patterns.abstractpattern;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DaoFactory daoFactory = null;
		Dao dao = null;
		
		daoFactory = DaoMaker.makeDaoFactory("xml");
		dao = daoFactory.createDao("emp");
		
		dao.save();
		
		System.out.println("-----------------------");
		daoFactory = DaoMaker.makeDaoFactory("db");
		dao = daoFactory.createDao("dept");
		dao.save();
	}

}
