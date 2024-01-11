package com.rathod.assignments.faq;

import java.util.*;

public class RemovDupliArrayElm {
	public static void main(String[] args) {
		 
		  // A string array with duplicate values
		String[] data = { "E", "C", "B", "E", "A", "B", "E", "D", "B", "A" };
		 
		System.out.println("Original array         : " + Arrays.toString(data));
		 
		 List<String> list = Arrays.asList(data);
		 Set<String> set = new HashSet<String>(list);
		 
		 System.out.print("After removing duplicates: ");
		 String[] resArray= new String[set.size()];
		 set.toArray(resArray);
		 
		 for (String ele: resArray) {		 
			 System.out.print(ele + ", ");		 
		 }		 
	}
}
