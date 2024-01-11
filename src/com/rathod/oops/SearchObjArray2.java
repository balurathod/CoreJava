package com.rathod.oops;
import java.util.*;

class SearchObjArray2 
{
	public static void main(String[] args) 
	{
		String [] sa = {"One" , "Two" , "Three" , "four"};
		
		List<Integer> iL = new  ArrayList<Integer>();
		
		for (int x = 0; x<3  ;x++)
           iL.add(x);
		
		Object [] oa = iL.toArray();    //Obj arry
		
		//Integer[] ia2 = iL.toArray(1);  //Int arry
        // ia2 = iL.toArray(ia2);

		for (String s : sa )
			System.out.print(s + " ");
		    System.out.println("\nsl[1] = " + iL.get(1));
	}
	static class ReSortComparator implements Comparator<String>
	{
		public int compare(String a, String b)
		{
			return b.compareTo(a);
		}

	}
}
/*

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray2.java
SearchObjArray2.java:16: cannot find symbol
symbol  : method toArray(int)
location: interface java.util.List<java.lang.Integer>
                Integer[] ia2 = iL.toArray(1);  //Int arry
                                  ^
1 error

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray2.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray2
One Two Three four
sl[1] = 1

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>

*/