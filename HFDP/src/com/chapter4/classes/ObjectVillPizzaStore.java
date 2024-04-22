package com.chapter4.classes;

import java.util.zip.ZipError;

import com.chapter4.interfaces.Pizza;
import com.chapter4.interfaces.PizzaStore;

public class ObjectVillPizzaStore implements PizzaStore{
	SimplePizzaFactory factory;
	
	public ObjectVillPizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = factory.createPizza(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
