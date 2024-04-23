package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;
import com.chapter4.interfaces.PizzaStore;

public abstract class ObjectVillPizzaStore implements PizzaStore{
//	SimplePizzaFactory factory;
//	
//	public ObjectVillPizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}
	
	@Override
	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = createPizza(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	protected abstract Pizza createPizza(String pizzaType);

}
