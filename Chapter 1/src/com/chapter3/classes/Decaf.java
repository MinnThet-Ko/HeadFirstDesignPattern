package com.chapter3.classes;

import com.chapter3.abstractClasses.Beverage;

public class Decaf extends Beverage{

	public Decaf() {
		description = "Decaf";
	}
	@Override
	public double cost() {
		return 1.5;
	}

}
