package com.rathod.assignments.faq;

import java.util.ArrayList;
import java.util.List;

public class ArrayListElementReplace {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Furth");
		
		System.out.println("before replace size " + al.size() + " List " + al);
		
		al.set(2, "Five");
		System.out.println("after replace size " + al.size() + " List " + al);
		
		// Repalce array element
		int arr[] = {1,2,3,4,5,6};
		int count = 0, i;
        for (i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                count++;
                arr[i]=5;
                //System.out.println("in if arr[i] "+ arr[i]);
            }
            System.out.println("in for arr[i] "+ arr[i] +" count " + count);
        }
	
	}

}
