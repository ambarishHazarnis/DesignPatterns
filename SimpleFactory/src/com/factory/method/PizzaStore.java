package com.factory.method;


public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		
		Pizza pizza = createPizza(type); // Factory method
		if(pizza!=null){
			pizza.dough();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		
		return pizza;
	}
	
	public abstract Pizza createPizza(String type);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

