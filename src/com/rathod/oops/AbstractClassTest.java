package com.rathod.oops;

abstract class AbstractClassTest {
	private int i ;
	private String str;
	
	AbstractClassTest(int i, String str) {//to initialize class variable 
		this.i= i; 
		this.str = str;
		System.out.println("Abs class i = "+ i +" and str " + str); 
	}
	
	public int mutiply(int val) {
	       return i * val;
	    }
		
	abstract void mtd();	
}


