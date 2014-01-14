package com.deco.pattern;

public class Latte extends CondimentDecorator {

	public Latte(Beverage beverage){
		this.b = beverage;
	}
	
	@Override
	public double cost() {
		return 0.15 + b.cost() ;
	}

	@Override
	public String getDescription() {
		return "Latte" + ", " + b.getDescription() ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
