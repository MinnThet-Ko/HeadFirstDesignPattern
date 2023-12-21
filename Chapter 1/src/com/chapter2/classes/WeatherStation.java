package com.chapter2.classes;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(70, 80, 60);
		weatherData.setMeasurements(75, 85, 55);
		weatherData.setMeasurements(65, 75, 65);
	}

}
