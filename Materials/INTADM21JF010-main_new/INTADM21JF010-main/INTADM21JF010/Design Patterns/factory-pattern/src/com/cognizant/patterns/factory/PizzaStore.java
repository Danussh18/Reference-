package com.cognizant.patterns.factory;

public class PizzaStore {
/*
 public Pizza orderPizza(String type) {
	 Pizza p = null;
	 if(type.equalsIgnoreCase("normal"))
		 p = new Pizza();
	 else if(type.equalsIgnoreCase("spicy"))
		 p = new SpicyPizza();
	 else if(type.equalsIgnoreCase("cheese"))
		 p = new CheesePizza();
	 
	 p.prepare();
	 p.bake();
	 p.cut();
	 
	 return p;	 
 }
*/
 public Pizza orderPizza(String type) {
	 Pizza p = PizzaFactory.createPizza(type);
	 
	 p.cut();
	 
	 return p;
 }	
}
