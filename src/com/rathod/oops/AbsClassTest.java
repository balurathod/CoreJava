package com.rathod.oops;

abstract class AbsClass {
	abstract void run();
	
}

public class AbsClassTest {

	void run(){
		System.out.println("Abstract class mtd");
	}
	public static void main(String[] args) {
		AbsClassTest ts = new AbsClassTest();
		ts.run();
		System.out.println("Public class mtd");
		
	}

}
