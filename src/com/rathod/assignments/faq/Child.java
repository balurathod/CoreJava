package com.rathod.assignments.faq;

class Parent {
	public void mtd() {
		System.out.println("Parent mtd");
	}

}

public class Child extends Parent {
	public void mtd() {
		System.out.println("Child mtd");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		Parent pc = new Child();
		Child c = new Child();
		Child c1 = new Child();
		Child c3 = new Child();
		// Child cp = new Parent();
		p.mtd();
		pc.mtd();
		c.mtd();
		System.out.println(c.hashCode());
		System.out.println(pc.hashCode());
		System.out.println(c.equals(c));
		System.out.println(c.equals(p));
		// cp.mtd();
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());

	}

}
