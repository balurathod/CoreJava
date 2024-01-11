package com.rathod.oops;
import java.util.*;

public class TestBadLegacy 
{
	public static void main(String[] args) 
	{
		List<Long> myList = new ArrayList<Long>();
			myList.add(8);
		    myList.add(6);

			Inserter in = new Inserter();
			in.insert(myList);        //pass list<Long> to Legacy code
//			System.out.println("insert= " + insert(42));

//run but no o/p  why?
	}
}
class Inserter
{
	//method vt a non-gen List arg
	void insert(List list)
	{
		list.add(new Long(42));
	}
}

/*

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac TestBadLegacy1.java
Note: TestBadLegacy1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

*/