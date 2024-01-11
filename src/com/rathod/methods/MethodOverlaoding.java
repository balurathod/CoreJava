package com.rathod.methods;

public class MethodOverlaoding {
	
	public void method(int a , float b) {
		System.out.println("hi...");
		
	}
	
	public void method(float b, int a) {
		System.out.println("hi...next");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverlaoding ml = new MethodOverlaoding();
		ml.method(4.3f, 2);
		ml.method(6, 4.9f);

	}

}
