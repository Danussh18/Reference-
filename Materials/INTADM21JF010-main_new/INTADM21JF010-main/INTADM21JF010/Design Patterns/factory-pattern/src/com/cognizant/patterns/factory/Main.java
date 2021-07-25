package com.cognizant.patterns.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("what type of pizza you want to have [Normal | Spicy | Cheese]: ");
		String type = sc.next();
		
		PizzaStore pStore = new PizzaStore();
		Pizza p = pStore.orderPizza(type);
		
		System.out.println(p);
		sc.close();
	}

}
