package com.factory.method;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Pizza {

	protected String name=null;
	protected String sauce=null;
	protected String crust=null;
	protected ArrayList<String> toppings = new ArrayList<String>();
	
	public void dough(){
		System.out.println("Preparing the dough of "+ crust +" crust ...");
	}
	public void bake(){
		System.out.println("Applying "+ sauce +" sauce... ");
		Iterator<String> it = toppings.iterator();
		System.out.print("Garnishing with ");
		while(it.hasNext())
			System.out.print(it.next()+ " ");
		System.out.println();
	}
	public void cut(){
		System.out.println("Cutting the pizza in triangle shape ...");
	}
	public void box(){
		System.out.println("Packing the box ...");
	}
	public String toString(){
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

