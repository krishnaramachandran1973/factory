package com.cts.store;

import com.cts.pizzas.Pizza;

// Factory method pattern
public abstract class PizzaStore {

	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}
