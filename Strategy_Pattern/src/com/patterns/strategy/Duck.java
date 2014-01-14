package com.patterns.strategy;

public abstract class Duck {
	
	//Members
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	//Methods
	protected void swim(){
		System.out.println("I can swim. All ducks can swim :P ");
	}
	
	protected abstract void display();
	
	protected void performFly(){
		flyBehaviour.fly();
	}
	
	protected void performQuack(){
		quackBehaviour.quack();
	}
	
	protected void setFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	
	protected void setQuackBehaviour(QuackBehaviour qb){
		quackBehaviour = qb;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
