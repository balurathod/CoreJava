package com.rathod.oops;
import java.util.*;

class SearchObjArray1 
{
	public static void main(String[] args) 
	{
		String [] sa = {"One" , "Two" , "Three" , "four"};
	
		/*Arrays.sort(sa);    //optional
		for (String s :sa )
			System.out.print(s + " ");//sorted ordr 
      */
		List sList = Arrays.asList(sa);
        System.out.println("\nsize " + sList.size());
		System.out.println("idx2 " + sList.get(2));
		
		sList.set(3 , "six");  
		sa[1] = "five";
		
		for (String s :sa )
			System.out.print(s + " ");
		    System.out.println("\nsl[1] = " + sList.get(1));
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


G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray1.java
Note: SearchObjArray1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray1
size 4
idx2 Three
One five Three six
sl[1] = five

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray1.java -Xlint
SearchObjArray1.java:13: warning: [unchecked] unchecked call to set(int,E) as a member of the raw type java.util.List
                sList.set(3 , "six");
                         ^
1 warning

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray1.java -Xlint
SearchObjArray1.java:16: warning: [unchecked] unchecked call to set(int,E) as a member of the raw type java.util.List
                sList.set(3 , "six");
                         ^
1 warning

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray1.java
Note: SearchObjArray1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray1
One Three Two four size 4
idx2 Two
One five Two six
sl[1] = five

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray1.java
Note: SearchObjArray1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray1
One
Three
Two
four
size 4
idx2 Two
One five Two six
sl[1] = five

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SearchObjArray1.java
Note: SearchObjArray1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SearchObjArray1
One Three Two four
size 4
idx2 Two
One five Two six
sl[1] = five

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>

*/