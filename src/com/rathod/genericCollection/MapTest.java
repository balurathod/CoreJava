package com.rathod.genericCollection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
  * Java Program to demonstrate How to use LinkedHashMap, TreeMap and HashMap.
  * It shows that HashMap doesn't guarantee any order, TreeMap keeps them in 
  * sorted order determined by default using Comparable or explicit Comparator
  * provided by client, and LinkedHashMap also keep mapping in order they
  * are added or accessed., 
  *
  * @author Javin Paul
  */
public class MapTest {   
    public static void main(String args[]){
     
        //Using HashMap as general purpose single threaded cache
        Map<Integer, String> cache = new HashMap<Integer, String>();
        cache.put(1, "Stuart");
        cache.put(2, "Steven");
        cache.put(3, "James");
        cache.put(4, "Ian");
        System.out.printf("Name of Employee with id %d is %s %n", 1, cache.get(1));
        System.out.println("Order of Entries in HashMap - Not guaranteed");
        System.out.println(cache);
       
        //Using TreeMap to create a sorted cache, sorting keys on reverse order
        SortedMap<Integer, String> sortedCache = new TreeMap<Integer, String>(Collections.reverseOrder());
        sortedCache.putAll(cache);
        System.out.println("Order of Entries in TreeMap - Sorted in reverse order");
        System.out.println(sortedCache);
       
        //Using LinkedHashMap to create copy of a Map in Java
        Map<Integer, String> copy = new LinkedHashMap<Integer, String>(sortedCache);
        System.out.println("Order of Entries in a copy Map created by LinkedHashMap");
        System.out.println(copy);
       
    }
}

/*	Output:
	Name of Employee with id 1 is Stuart

	Order of Entries in HashMap - Not guaranteed
	{1=Stuart, 2=Steven, 3=James, 4=Ian}

	Order of Entries in TreeMap - Sorted in reverse order
	{4=Ian, 3=James, 2=Steven, 1=Stuart}

	Order of Entries in a copy Map created by LinkedHashMap
	{4=Ian, 3=James, 2=Steven, 1=Stuart}

	You can see that TreeMap has sorted mappings in reverse order, because of reverse Comparator provided to it. Also LinkedHashMap has created a copy of TreeMap and order of entries are retained.


	Read more: http://javarevisited.blogspot.com/2015/08/difference-between-HashMap-vs-TreeMap-vs-LinkedHashMap-Java.html#ixzz3mY2DLrKP
	*/