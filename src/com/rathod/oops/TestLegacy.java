package com.rathod.oops;
//A java5 class using a genric collcn......
import java.util.*; 
class  TestLegacy
{
	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(4);
		myList.add(6);

		Adder adder = new Adder();

		int total = adder.addAll(myList); //pas it to an untyped arg. 

		System.out.println("Total!" + total);

	}
}


/*
what is the reason of writing two seprt classes.(TestLegacy & Adder)?  
To access only obj of that class, it is concept of typed two class vt each other for prtclr funlity  
*/