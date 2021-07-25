package com.cognizant.patterns.factory;

public class CheesePizza extends Pizza {
	private String cheeseType;
	
	public String getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}

	@Override
	public String toString() {
		return "CheesePizza [cheeseType=" + cheeseType + "]";
	}

}
