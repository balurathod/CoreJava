package com.rathod.oops;
import java.util.*;
class TestSorting 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> stuff = new ArrayList<Integer>();
		
		stuff.add(10);
		stuff.add(42);
		stuff.add(420);
		stuff.add(26);
		stuff.add(0);
		
		System.out.println("Unsortwed" + stuff);
        Collections.sort(stuff);
        System.out.println("Sorted " + stuff);
        
	}
}