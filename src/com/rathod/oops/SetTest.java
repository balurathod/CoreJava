package com.rathod.oops;
import java.util.*;
class SetTest 
{
	public static void main(String[] args) 
	{
		boolean[] ba = new boolean[5];    //1
		
        Set s = new HashSet();		 
//          Set s = new TreeSet();   classcastException aries.
		           
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");//not excuted bcz duplicate entry of a string into Set
		ba[4] = s.add(new Object());
		
		for (int x = 0; x < ba.length ; x++ )
		   System.out.println(ba[x] + " ");
		   System.out.println("\n");
        
		for (Object o : s )
           System.out.println(o + " ");
        
	}
}
/*

Whenever..u want a collcn to b sorted it's element must be mutualy comparable.


Remember....dat unless othrvise specified objs of diff types r not mutually comparable..


G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SetTest.java
Note: SetTest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SetTest
true
true
true
false
true


b
a
42
java.lang.Object@3e25a5

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac SetTest.java
Note: SetTest.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java SetTest
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        at java.lang.Integer.compareTo(Integer.java:35)
        at java.util.TreeMap.put(TreeMap.java:545)
        at java.util.TreeSet.add(TreeSet.java:238)
        at SetTest.main(SetTest.java:12)

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>




*/