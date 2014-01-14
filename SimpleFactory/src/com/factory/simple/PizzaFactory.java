package com.factory.simple;

public class PizzaFactory {
	Pizza pizza;
	
	public Pizza createPizza(String type){
		if(type.equals("Cheese"))
			pizza = new CheesePizza();
		else
			if(type.equals("Pepperoni"))
				pizza = new PepperoniPizza();
		
		return pizza;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
