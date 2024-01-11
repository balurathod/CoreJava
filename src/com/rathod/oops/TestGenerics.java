package com.rathod.oops;

import java.util.*;

public class TestGenerics {
public static void main(String[] args) {
	List<String> ls = new ArrayList<String>(); // 1
	List<Object> lo = null ;//= ls;
	lo.add(new Object()); // 3
	String s = ls.get(0); // 4: Attempts to assign an Object to a String!
}
}
