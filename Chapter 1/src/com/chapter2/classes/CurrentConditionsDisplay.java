package com.chapter2.classes;

import java.util.Observable;
import java.util.Observer;

import com.chapter2.interfaces.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temp;
	private float humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions:" + this.temp
				+ "F degrees and " + this.humidity + "% humidity.");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}

	

}
