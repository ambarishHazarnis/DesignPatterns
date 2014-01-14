package com.deco.pattern;

public class Mocha extends CondimentDecorator {
	
	Mocha(Beverage beverage){ this.b = beverage;}
	
	@Override
	public double cost() { return 0.10 + b.cost(); }

	@Override
	public String getDescription() { return "Mocha "+ ", " + b.getDescription(); }

	public static void main(String[] args) {}

}
