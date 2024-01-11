package com.rathod.collection;
import java.util.*;
public class ListImpl {

	public static void main(String[] args) {
		// Interface name: List
		// Three classes that implement the List interface: 
		List<String> bigList = new ArrayList<String>();
		List<String> littleList = new LinkedList<String>();
		List<String> sharedList = new Vector<String>();

		// All three have an add method
		bigList.add("in array list");
		littleList.add("in linked list");
		sharedList.add("in vector");
		
		// All three have a get method
		System.out.println(bigList.get(0));
		System.out.println(littleList.get(0));
		System.out.println(sharedList.get(0));
	}

}
