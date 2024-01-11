package com.rathod.oops;

public class StaticBlock {
	static {	//after java 7 without main mtd prog vl display exception
		System.out.println("Static block");
	}
	 public static void main(String [] args) {
		 System.out.println("Main mtd: ");
	 }
}
