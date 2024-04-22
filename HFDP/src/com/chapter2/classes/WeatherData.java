package com.chapter2.classes;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;

//public class WeatherData implements Subject{
//public class WeatherData extends Observable{	
public class WeatherData{	
	PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.setTemp(temp);
		this.setHumidity(humidity);
		this.setPressure(pressure);	 
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.addPropertyChangeListener(listener);
	}
	
	public float getTemp() {		
		return temp;
	}

	public void setTemp(float temp) {
		this.propertyChangeSupport.firePropertyChange("temp", this.temp, temp);
		this.temp = temp;		
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.propertyChangeSupport.firePropertyChange("humidity", this.humidity, humidity);
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.propertyChangeSupport.firePropertyChange("pressure", this.pressure, pressure);
		this.pressure = pressure;
	}
	

}
