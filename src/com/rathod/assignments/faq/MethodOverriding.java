package com.rathod.assignments.faq;

class ClassParent {
	public void t() {
		System.out.println("Parent mtd");
	}
	public void t(int i) {
		System.out.println("Parent mtd vt i");
	}
}

public class MethodOverriding extends ClassParent {

	public void t() {
		System.out.println("child mtd");
	}
	public void t(int i, int j) {
		System.out.println("child  mtd vt i & j");
	}
	public static void main(String[] args) {
		ClassParent cp = new MethodOverriding();
		MethodOverriding mo = new MethodOverriding();
		cp.t();
		cp.t(5);
		//cp.t(3, 6); error
		mo.t(3, 6);
	}

}
