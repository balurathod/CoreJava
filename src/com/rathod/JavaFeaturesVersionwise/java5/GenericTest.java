package com.rathod.java5;

import java.util.*;
//Generics is one of the most useful features added in Java 5. 
//It adds compile-time type safety to the Collections Framework and eliminates the necessity for type casting.
public class GenericTest {
	public static void main(String[] args) 
	{
		
		//Problem
		
//		 List names = new ArrayList();
//		    names.add("Ram");
//		    names.add("Peter");
//		    names.add("Khan");
//		    names.add("Singh");
//		    names.add(new Date());	// Compiler accepts
		   
		
		//Solution
		
	    List<String> names = new ArrayList<String>();
	    names.add("Ram");
	    names.add("Peter");
	    names.add("Khan");
	    names.add("Singh");
	    //names.add(new Date());	// Compiler error
	    for(int i = 0; i < names.size(); i++) {
		// No need of type casting (String)
		String name = names.get(i);	
		System.out.println(" Name = " + name);
	    }
	}
}