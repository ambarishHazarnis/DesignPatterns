package com.patterns.strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeek();
	}
	
	@Override
	protected void display() {
		System.out.println("I am a Rubber Duck.");
	}

	public static void main(String[] args) {
		Duck rd = new RubberDuck();
		rd.display();
		rd.swim();
		rd.performFly();
		rd.performQuack();

	}

}
