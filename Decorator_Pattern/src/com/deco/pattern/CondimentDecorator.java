package com.deco.pattern;

public abstract class CondimentDecorator extends Beverage {
	Beverage b;
	@Override
	public abstract double cost();
	public abstract String getDescription();

	public static void main(String[] args) {}

}
