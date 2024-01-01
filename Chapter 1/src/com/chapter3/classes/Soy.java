package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;
import com.chapter3.abstractClasses.CondimentDecorator;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+", soy";
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.15;
	}

}
