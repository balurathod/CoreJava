package com.rathod.collection.map;
import java.util.*;
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap< String, String> tm = new TreeMap<String, String>();
		tm.put("In", "India");
		tm.put("End", "England");
		tm.put("Po", "Portugal");
		tm.put("Jn", "Jarmany");
		tm.put("JP", "Japan");
		tm.put("UK", "America");
		System.out.println("Tree map  "+tm);
		System.out.println("Tree map desc "+tm.descendingMap());

	
	}

}
