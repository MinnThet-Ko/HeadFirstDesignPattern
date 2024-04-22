package com.chapter4.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.chapter4.interfaces.Pizza;
import com.chapter4.interfaces.PizzaStore;

public class PizzaOrderingSystem {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new ObjectVillPizzaStore(new SimplePizzaFactory());
		Map<Integer, String> pizzaMap = new HashMap<Integer, String>();
		pizzaMap.put(1, "cheese");
		pizzaMap.put(2, "pepperoni");
		pizzaMap.put(3, "veggie");
		pizzaMap.put(4, "clam");
		
		Scanner inputScanner = new Scanner(System.in);
		int option = -1;
		while(option != 0) {
			
			System.out.println("Choose a pizza");
			System.out.println("1. Cheese");
			System.out.println("2. Pepperoni");
			System.out.println("3. Veggie");
			System.out.println("4. Clam");
			option = inputScanner.nextInt();
			if(option == 0) {
				break;
			}
			Pizza orderedPizza = pizzaStore.orderPizza(pizzaMap.get(option));
			System.out.println("The pizza has arrived."+orderedPizza.getClass());
		}
		inputScanner.close();

	}

}
