package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;

public class NYStylePepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("The NY style pepperoni pizza is prepared.");
	}

	@Override
	public void bake() {
		System.out.println("The NY style pepperoni pizza is baked.");
	}

	@Override
	public void cut() {
		System.out.println("The NY style pepperoni pizza is cut.");
	}

	@Override
	public void box() {
		System.out.println("The NY style pepperoni pizza is boxed.");
	}

}
