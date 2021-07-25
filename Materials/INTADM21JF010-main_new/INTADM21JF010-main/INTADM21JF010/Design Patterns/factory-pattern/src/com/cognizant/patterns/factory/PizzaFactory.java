package com.cognizant.patterns.factory;

public class PizzaFactory {
 public static Pizza createPizza(String type) {
	 Pizza p = null;
	 if(type.equalsIgnoreCase("normal"))
		 p = new Pizza();
	 else if(type.equalsIgnoreCase("spicy"))
		 p = new SpicyPizza();
	 else if(type.equalsIgnoreCase("cheese"))
		 p = new CheesePizza();
	 
	 p.prepare();
	 p.bake();
	// p.cut();
	 
	 return p;	 	 
 }
}
