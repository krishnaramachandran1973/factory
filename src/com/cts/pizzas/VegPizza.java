package com.cts.pizzas;

public class VegPizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing VegPizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking");
	}

	@Override
	public void cut() {
		System.out.println("Cutting");

	}

	@Override
	public void box() {
		System.out.println("Boxing");
	}

	@Override
	public String toString() {
		return "VegPizza [created]";
	}

}
