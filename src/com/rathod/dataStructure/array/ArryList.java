package com.rathod.dataStructure.array;

import java.util.List;

class ArrayList {
	public static void main(String[] args) {
		// List test = new ArrayList(); //upto to java4 List is super class of
		// ArrayList

		List<String> test = new ArrayList<String>(); // new from java5
		String s = "hi";

		test.add("String");
		test.add(s);
		test.add(s + s);

		System.out.println(test.size());
		System.out.println(test.contains(42));
		System.out.println(test.contains("hihi"));
		// Collections.add(test);
		test.remove("hi");
		System.out.println(test.size());
	}
}
