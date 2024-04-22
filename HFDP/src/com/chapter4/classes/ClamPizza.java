package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;

public class ClamPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("The clam pizza is prepared.");
	}

	@Override
	public void bake() {
		System.out.println("The clam pizza is baked.");
	}

	@Override
	public void cut() {
		System.out.println("The clam pizza is cut.");
	}

	@Override
	public void box() {
		System.out.println("The clam pizza is boxed.");
	}

}
