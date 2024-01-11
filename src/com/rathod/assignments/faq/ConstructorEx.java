package com.rathod.assignments.faq;

public class ConstructorEx {

	int i = 324567890;

	public ConstructorEx() {
		System.out.println("default constor");
	}

	public ConstructorEx(int i) {
		System.out.println("Paramerized constor " + i);
	}
	
	public ConstructorEx(String s, String s1) {
		System.out.println("str constor");
	}

	public ConstructorEx(String s, Integer s1) {
		System.out.println("str and integer constor " + i);
	}


	public static void main(String[] args) {
		ConstructorEx ce = new ConstructorEx(5);
		// ConstructorEx ce1 = new ConstructorEx(null, null); //ambiguity error
	}

}
