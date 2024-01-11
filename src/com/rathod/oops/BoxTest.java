package com.rathod.oops;


class Box {
  Object o;
	Box(Object o) { // mutuator
		this.o=o;
	}
	Object get() { //accessor
		return o;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		
		Integer i = new Integer(10);

		//make this box to store only Integers
		Box b1 = new Box(i);		
		Integer x  = (Integer) b1.get();
		System.out.println("x : "+x);

		//done by somebody..no error
		Box b2 = new Box("20");

		//extraction dobe by you

		Integer y  = (Integer) b2.get();
		System.out.println("y : "+y);

	}
}



