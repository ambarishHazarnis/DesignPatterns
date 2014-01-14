package com.deco.pattern;

public abstract class Beverage {

	protected String description;
	
	public void setDescription(String description){ this.description = description; }	
	
	public String getDescription(){ return description;}
	
	public abstract double cost();

	public static void main(String[] args) {}
}
