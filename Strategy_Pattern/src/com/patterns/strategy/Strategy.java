package com.patterns.strategy;

import java.util.Observable;
import java.util.Observer;

class WeatherData extends Observable{

	void measurementChanged(){
		setChanged();
		notifyObservers();
	}
}

public class Strategy {
	public static void main(String[] args) {		
		MallardDuck.main(null);
		RubberDuck.main(null);
		}
}
