package com.chapter3.abstractClasses;

public abstract class Beverage {
	protected String description = "Unknown beverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();	

}
