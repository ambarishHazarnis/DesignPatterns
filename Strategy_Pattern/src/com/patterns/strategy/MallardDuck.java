package com.patterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	@Override
	protected void display() {
		System.out.println("I am a Mallard Duck.");
	}

	public static void main(String[] args) {
		Duck md = new MallardDuck();
		md.display();
		md.swim();
		md.performFly();
		md.performQuack();
	}
}
