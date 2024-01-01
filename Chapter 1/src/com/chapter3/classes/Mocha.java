package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;
import com.chapter3.abstractClasses.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+", mocha";
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.20;
	}

}
