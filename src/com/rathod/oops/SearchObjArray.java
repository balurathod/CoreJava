package com.rathod.oops;
import java.util.*;

class SearchObjArray 
{
	public static void main(String[] args) 
	{
		String [] sa = {"One" , "Two" , "Three" , "four"};  //randm ordr
		Arrays.sort(sa);
		for (String s :sa )
			System.out.print(s + " ");//sorted ordr
		    System.out.println("\none = " + Arrays.binarySearch(sa, "four"));
			System.out.println("now reverse sort ");

			ReSortComparator rs = new ReSortComparator();
			Arrays.sort(sa,rs);
        for (String s :sa )
			System.out.print(s + " ");
		    System.out.println("\none = " + Arrays.binarySearch(sa, "four"));
			System.out.println("\none = " + Arrays.binarySearch(sa, "four" , rs));
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

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray
One
Three
Two
four

one = -5
now reverse sort
four
Two
Three
One

one = -5

one = -1

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray
One Three Two four
one = -5
now reverse sort
four Two Three One
one = -5

one = -1

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray
One Three Two four
one = -5
now reverse sort
four Two Three One
one = -5

one = -1

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray
One Three Two four
one = 3
now reverse sort
four Two Three One
one = -5

one = -1

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray
One Three Two four
one = 3
now reverse sort
four Two Three One
one = -5

one = 0

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>


*/