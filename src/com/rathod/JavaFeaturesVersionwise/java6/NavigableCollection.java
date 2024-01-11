package com.rathod.java6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class NavigableCollection {
	public static void main(String[] args) {

	  NavigableSet navSet = new ConcurrentSkipListSet();
	  navSet.add("Bronze");
	  navSet.add("Silver");
	  navSet.add("Gold");
	  navSet.add("Platinum");
	  navSet.add("Diamond");

	  String item = null;

	  for (Iterator it = navSet.iterator(); it.hasNext();) {
	   item = (String) it.next();
	   System.out.println("Navigable items in aescending order-->" + item);

	  }
	  System.out.println("------------------------------------------------");
	  for (Iterator it = navSet.descendingIterator(); it.hasNext();) {
	   item = (String) it.next();
	   System.out.println("Navigable items in descending order-->" + item);

	  }
	  Set hashSet = new HashSet(navSet);
	  System.out.println("------------------------------------------------");
	  for (Iterator it = hashSet.iterator(); it.hasNext();) {
	   item = (String) it.next();
	   System.out.println("Set items with no specific order-->" + item);
	   // we can't guarantee the order the with HashSet
	   // Where as TreeSet implements sortedSet and new interface
	   // NavigableSet.
	   // So it provides more methods for the ordering and navigation.
	   // By Default TreeSet follows natural ordering
	  }
	  // Some of the methods introduced in jdk 1.6
	  System.out.println("Lower item than the Gold in the set-->"+ navSet.lower("Gold"));
	  // Lower method works by assuming all elements are in ascending order
	  System.out.println("------------------------------------------------");
	  String firstItem = (String) navSet.pollFirst();
	  System.out.println("removed the first item-->" + firstItem);
	  for (Iterator it = navSet.descendingIterator(); it.hasNext();) {
	   item = (String) it.next();
	   System.out.println("Navigable items in after removing the first item-->"+ item);
	  }
	 }
	}
