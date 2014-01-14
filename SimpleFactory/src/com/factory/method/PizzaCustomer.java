package com.factory.method;


public class PizzaCustomer {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				PizzaStore amboCA = new CApizzaStore();
				Pizza pizza = amboCA.orderPizza("Cheese");
				System.out.println(" Your " + pizza + " is ready !");
			}
		


	}


