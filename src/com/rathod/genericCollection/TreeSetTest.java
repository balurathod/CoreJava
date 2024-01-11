package com.rathod.genericCollection;
import java.util.*;
public class TreeSetTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pepsi");
		al.add("Volvo");
		al.add("IBM");
		al.add("Amazon");
		al.add("Apple");
		al.add("StarBus");
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(al);
		System.out.println("Tree set by default sorting "+ts);
		System.out.println("Tree map desc "+ts.descendingSet());
		System.out.println("Tree map first elem "+ts.first());
		System.out.println("Tree map last elem "+ts.last());
		System.out.println("Tree map IBM true "+ts.headSet("IBM", true));
		System.out.println("Tree map IBM false "+ts.tailSet("IBM", false));
		System.out.println("Tree map subSet "+ts.subSet("Amazon", true, "StarBus", true));
		System.out.println("Tree map ceiling "+ts.ceiling("IBM"));
	}
}
