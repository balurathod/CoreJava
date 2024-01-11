package com.rathod.oops;

class ATest{

	public static void m(int m){
		System.out.println("Int parameter");
	}
	public static void m(String m1){
		System.out.println("String parameter");
	}
}


class BTest extends ATest{
	public static void m(int m){
		System.out.println("Inside BTest");
	}
}
public class TestAB{
	public static void main(String[] args) {
		//BTest.m();
		ATest aa=new BTest();
		aa.m(2);
		ATest.m(10);
		ATest.m("s");
		
	}
}