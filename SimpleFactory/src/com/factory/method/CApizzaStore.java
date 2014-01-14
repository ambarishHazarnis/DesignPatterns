package com.factory.method;

import com.factory.simple.CheesePizza;
import com.factory.simple.PepperoniPizza;

public class CApizzaStore extends PizzaStore {
	Pizza pizza;
	@Override
	public Pizza createPizza(String type) {
		if(type.equals("Cheese"))
			pizza = new CAcheesePizza();
		else
			if(type.equals("Pepperoni"))
				pizza = new CApepperoniPizza();
		
		return pizza;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
