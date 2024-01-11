package com.rathod.assignments.faq;

public class AbsImpl extends Abs {
	String str1111 = "";

	public AbsImpl(String string) {
		super();
		super.str = str;
		System.out.println("super constr " + str);
		System.out.println("sub constr" + string);
	}

	@Override
	public String toString() {
		return "AbsImpl [str=" + str1111 + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static void main(String[] args) {
		AbsImpl ai = new AbsImpl(" Val");
		System.out.println("Hello " + ai);
	}

}
