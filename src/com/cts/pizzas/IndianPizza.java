package com.cts.pizzas;

public class IndianPizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing Indian pizza");
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
		return "IndianPizza [created]";
	}

}
