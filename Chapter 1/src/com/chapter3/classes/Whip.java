package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;
import com.chapter3.abstractClasses.CondimentDecorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+", whip";
	}

	@Override
	public double cost() {
		return this.beverage.cost() + 0.10;
	}

}
