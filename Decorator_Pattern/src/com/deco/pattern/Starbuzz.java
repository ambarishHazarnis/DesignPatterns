package com.deco.pattern;

public class Starbuzz {

	public static void main(String[] args) {
		
		/*Espresso with double Latte*/
		Beverage b1 = new Espresso();
		b1 = new Latte(b1);
		b1 = new Latte(b1);
		System.out.println(b1.getDescription() + ": " + b1.cost());
		
		/*Decaf with Mocha*/
		Beverage b2 = new Decaf();
		b2 = new Mocha(b2);
		System.out.println(b2.getDescription() + ": " + b2.cost());
		
		
	}

}
