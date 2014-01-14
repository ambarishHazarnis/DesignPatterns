package com.deco.pattern;

public class Espresso extends Beverage {

	Espresso(){ setDescription("Espresso"); }
	
	@Override
	public double cost() { return 1.78;}

	public static void main(String[] args) {}
}
