package com.rathod.cashCreation;

public class testDebug {

	public static void main(String[] args) {
		Test test = new Test();
		
		int value = test.getInitialValue();
		test.doStuff(value);
		
		System.out.print("Start");
		
		System.out.print("increment value");
		
		value++;
		value = value - 8;
		
		System.out.print(value);
		System.out.print("Finish");

	}

}
