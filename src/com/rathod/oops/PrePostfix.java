package com.rathod.oops;

public class PrePostfix {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		/*
		 * System.out.println(x); System.out.println(x++);
		 * System.out.println(x); System.out.println(--x);
		 * 
		 * System.out.println(y); System.out.println(y++);
		 * System.out.println(y); System.out.println(--y);
		 */
		Integer i = 2;
		Integer l = 5;

		int k = 4;
		String s = "String";
		String s1 = "100";
		// System.out.println(i.valueOf(null));
		// System.out.println(i.valueOf(s));
		System.out.println("val " + i.valueOf(s1));
		System.out.println("val1 " + s1.valueOf(i));
		System.out.println("val2 " + i.compareTo(l));
		System.out.println("val3 " + i.doubleValue());

		boolean b = false;
		if (b = true) {// boolean assignment
			System.out.println("boolean assignment " + b);
		}
		boolean a = false;
		if (a == false)// boolean equality
		{
			System.out.println("boolean equality " + a);
		}

	}

}
