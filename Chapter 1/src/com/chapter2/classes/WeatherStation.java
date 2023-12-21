package com.chapter2.classes;

public class WeatherStation {

	public static void main(String[] args) {
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		WeatherData weatherData = new WeatherData();
		weatherData.addPropertyChangeListener(currentConditionsDisplay);
		weatherData.setMeasurements(70, 80, 60);
		weatherData.setMeasurements(75, 85, 55);
		weatherData.setMeasurements(65, 75, 65);
	}

}
