package com.rathod.oops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
	LinkedHashSet<String> hashSet=new LinkedHashSet<String>();
	hashSet.add("shyama");
	hashSet.add("kant");
	hashSet.add("sharma");
	hashSet.add("shyama");
	hashSet.add(null);
	hashSet.add(null);
	System.out.println("value    " +hashSet);
	LinkedHashSet<String> hashSet1=new LinkedHashSet<String>();
	hashSet1=(LinkedHashSet<String>) hashSet.clone();
	System.out.println("new value "+hashSet1);
	
	TreeSet<String> set=new TreeSet<String>();
	TreeSet<String> set1=new TreeSet<String>();
	set.add("shyama");
	set.add("kant");
	set.add("sharma");
	set.add("shyama");
	//set.add(null);
	set.add("1");
	System.out.println("value    " +set);
		
	
	
	HashSet<String> set2=new HashSet<String>();
	set2.add("shyama");
	set2.add("kant");
	set2.add("sharma");
	set2.add("shyama");
	set2.add(null);
	set2.add(null);
	set2.add("1");
	System.out.println("value    " +set2);
	Iterator<String> iterator=set2.iterator();
	while(iterator.hasNext()){
		String value=iterator.next();
		System.out.println("value using iterator:::::"+ value);
	}
	
}
}
