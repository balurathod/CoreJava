package com.rathod.oops;

public class MethodOveridingTest extends MethodOveriding {

	public void MtdOvrd() {
		System.out.println("Subclass mtd");
	}

	/*
	 * protected void MtdOvrd1() { System.out.println("Subclass mtd1"); }
	 */
	public String MtdOvrd2() throws RuntimeException {
		System.out.println("subclass MtdOvrd2");
		return "";
	}

	public static void main(String[] args) {
		MethodOveriding mo = new MethodOveridingTest();
		mo.MtdOvrd();
		mo.MtdOvrd1();
		mo.MtdOvrd2();
	}
}
