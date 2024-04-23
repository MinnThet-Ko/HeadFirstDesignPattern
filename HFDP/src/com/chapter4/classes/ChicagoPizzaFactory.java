package com.chapter4.classes;

import com.chapter4.interfaces.Pizza;

public class ChicagoPizzaFactory {
	
	public Pizza createPizza(String pizzaType) {
		Pizza  pizza = null;
		if(pizzaType.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} /*else if(pizzaType.equals("greek")) {
			pizza = new GreekPizza();
		}*/ else if(pizzaType.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if(pizzaType.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		} else if(pizzaType.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		return pizza;
	}

}
