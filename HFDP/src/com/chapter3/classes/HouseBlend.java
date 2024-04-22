package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;

public class HouseBlend extends Beverage{
	
	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
