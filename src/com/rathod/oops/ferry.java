package com.rathod.oops;
import java.util.*;
public class ferry 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);

		
		
	//Java5
      
		TreeSet<Integer> subset = new TreeSet<Integer>();
	 	subset =(TreeSet)times.headSet(1600);
		System.out.println("Java5 last bfor 4 pm is :" + subset.last());

        TreeSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 =(TreeSet)times.tailSet(2000);
		System.out.println("Java5 first aftor 8pm is :" + sub2.first());


        
		//JAVA6   using new higher() & lower() methods.
      
         System.out.println("J6-last befor 4pm is " + times.lower(1600));
		  System.out.println("J6-first aftor 8pm is " + times.higher(2000));
	}
}
/*

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac ferry.java

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java ferry
J6-last befor 4pm is 1545
J6-first aftor 8pm is 2010

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac ferry.java
Note: ferry.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java ferry    due to both active(Java 5 & 6 code)
Java5 last bfor 4 pm is :1545
Java5 first aftor 8pm is :2010
J6-last befor 4pm is 1545
J6-first aftor 8pm is 2010

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>
*/