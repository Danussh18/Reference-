package com.cognizant.patterns.factory;

public class Pizza {
	private int productCode;
	private float price;

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void prepare() {
		System.out.println("---- Preparign Pizza ----");
	}
	
	public void bake() {
		System.out.println("---- Baking Pizza ----");
	}
	
	public void cut() {
		System.out.println("---- Cutting Pizza ----");
	}

	@Override
	public String toString() {
		return "Pizza [productCode=" + productCode + ", price=" + price + "]";
	}	
}
