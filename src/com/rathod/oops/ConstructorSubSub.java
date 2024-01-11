package com.rathod.oops;

public class ConstructorSubSub extends ConstructorSub {

	public ConstructorSubSub() {
		super();
		// how to call prmtriz constructor from super class
		System.out.println("constructing a ConstructorSubSub instance");
	}

	public static void main(String[] args) {
		ConstructorSuper cs = new ConstructorSubSub();
		System.out.println("End");
	}

}
