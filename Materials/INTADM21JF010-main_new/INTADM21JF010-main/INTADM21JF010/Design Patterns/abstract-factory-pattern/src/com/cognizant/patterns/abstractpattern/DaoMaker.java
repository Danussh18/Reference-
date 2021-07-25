package com.cognizant.patterns.abstractpattern;

public class DaoMaker {
 public static DaoFactory makeDaoFactory(String factoryType) {
	 DaoFactory daoFactory = null;
	 
	 if(factoryType.equalsIgnoreCase("db"))
		 daoFactory = new DBDaoFactory();
	 else if(factoryType.equalsIgnoreCase("xml"))
		 daoFactory = new XMLDaoFactory();
	 
	 return daoFactory;
 }
}
