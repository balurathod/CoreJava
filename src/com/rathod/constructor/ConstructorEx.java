package com.rathod.constructor;

public class ConstructorEx {
	
	{
		System.out.println("Hello");
	}
	
	public ConstructorEx() {
		System.out.println("In Constructor");
	}
	
	

	public static void main(String[] args) {

		new ConstructorEx();
	}

}
