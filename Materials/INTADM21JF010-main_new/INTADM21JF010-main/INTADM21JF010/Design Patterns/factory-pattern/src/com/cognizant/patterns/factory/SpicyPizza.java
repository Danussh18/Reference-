package com.cognizant.patterns.factory;

public class SpicyPizza extends Pizza {
	private String spicyType;

	public String getSpicyType() {
		return spicyType;
	}

	public void setSpicyType(String spicyType) {
		this.spicyType = spicyType;
	}

	@Override
	public String toString() {
		return "SpicyPizza [spicyType=" + spicyType + "]";
	}
	
}
