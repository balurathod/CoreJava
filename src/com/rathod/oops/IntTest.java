package com.rathod.oops;

import java.util.*;

public class IntTest {
public static void main(String[] args) {
	List<String> test = new ArrayList<String>();
	int i=1;
	String s = "hi";
	test.add("string");
	System.out.print(test.toString());
	test.add(s);
	System.out.print(test);
	test.add(i+s+i+2);
	System.out.println(test);
	/*System.out.println(test.contains("hihi"));
	test.remove("hi");
	System.out.print(test);
	System.out.println(test.contains("hihi"));
	test.remove("hi");
	System.out.print(test);
	System.out.println(test.size());*/
}
}
