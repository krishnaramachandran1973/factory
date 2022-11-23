package com.cts;

import com.cts.factory.SimplePizzaFactory;
import com.cts.pizzas.Pizza;
import com.cts.store.CoimbatorePizzaStore;
import com.cts.store.PizzaStore;
import com.cts.store.PunePizzaStore;

public class PizzaTime {
	public static void main(String[] args) {
		PizzaStore store = new CoimbatorePizzaStore();
		Pizza pizza1 = store.orderPizza("veg");
		System.out.println(pizza1);
		
		PizzaStore store2 = new PunePizzaStore();
		Pizza pizza2 = store2.orderPizza("panner");
		System.out.println(pizza2);
	}

}
