package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Dark roast";
	}
	@Override
	public double cost() {
		return 2.25;
	}

}
