package com.rathod.oops;

public class AnimalCls implements Animals, Birds {

	public static void main(String[] args) {
		Animals a = new AnimalCls();
		Birds b = new AnimalCls();
		a.eat();
		a.pet();
		a.health();

		b.eat();
		b.pet();
		b.health();

	}

	@Override
	public String eat() {
		System.out.println("eat");
		return null;
	}

	@Override
	public String health() {
		System.out.println("health");
		return null;
	}

	@Override
	public String pet() {
		System.out.println("pet");
		return null;
	}

}
