package com.chapter2.classes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

import com.chapter2.interfaces.DisplayElement;

//public class CurrentConditionsDisplay implements Observer, DisplayElement{
public class CurrentConditionsDisplay implements PropertyChangeListener, DisplayElement{
	private float temp;
	private float humidity;	
	
	public CurrentConditionsDisplay() {
		this.temp = 0;
		this.humidity = 0;
	}

	@Override
	public void display() {
		System.out.println(String.format("Current temperature: %f", this.temp));
		System.out.println(String.format("Current humidity: %f", this.humidity));
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		switch (evt.getPropertyName()) {

		case "temp":
			this.temp = (float) evt.getNewValue();
			break;
			
		case "humidity":
			this.humidity = (float) evt.getNewValue();
			break;
			
		default:
			break;
		}
			
		this.display();
		
	}

	
		
	

	

}
