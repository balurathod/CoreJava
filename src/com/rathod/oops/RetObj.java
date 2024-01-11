package com.rathod.oops;
//RETURNING OBJECTS FROM METHODS
class Rectangle {
	int length;
	int breadth;
	
	Rectangle(int l,int b) {
		length = l;
		breadth = b;
	}
	Rectangle getRectangleObject() {
		Rectangle rect= new Rectangle(10,20);
		return rect;
	}
}
public class RetObj {
	public static void main(String args[]) {
		Rectangle ob1 = new Rectangle(40,50);
		Rectangle ob2;
		ob2 = ob1.getRectangleObject();
		System.out.println("ob1.length : " + ob1.length);
		System.out.println("ob1.breadth: " + ob1.breadth);
		System.out.println("ob2.length : " + ob2.length);
		System.out.println("ob2.breadth: " + ob2.breadth);
	}
}