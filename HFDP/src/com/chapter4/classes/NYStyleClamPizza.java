package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;

public class NYStyleClamPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("The NY style clam pizza is prepared.");
	}

	@Override
	public void bake() {
		System.out.println("The NY style clam pizza is baked.");
	}

	@Override
	public void cut() {
		System.out.println("The NY style clam pizza is cut.");
	}

	@Override
	public void box() {
		System.out.println("The NY style clam pizza is boxed.");
	}

}
