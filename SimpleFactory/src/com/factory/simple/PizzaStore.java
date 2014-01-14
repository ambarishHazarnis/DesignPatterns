package com.factory.simple;

public class PizzaStore {

	PizzaFactory factory;

	public Pizza orderPizza(String type){
		
		factory = new PizzaFactory();
		Pizza pizza = factory.createPizza(type); // Factory method

		pizza.dough();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
