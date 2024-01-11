package com.rathod.oops;

public class ConstructorSub extends ConstructorSuper {

	public String str = "Hello";

	public ConstructorSub() {
		System.out.println("constructing a ConstructorSub instance");
	}

	public ConstructorSub(String str) {
		System.out.println("constructing a ConstructorSub instance with parameter"+ str);
	}

}
