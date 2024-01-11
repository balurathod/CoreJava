package com.rathod.assignments.faq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayStringSorting {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList();
		al.add("Balu");
		al.add("Salu");
		al.add("Kalu");
		al.add("Dalu");
		al.add("Aalu");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
