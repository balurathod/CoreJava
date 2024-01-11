package com.rathod.oops;
import java.util.*;

public class TestBadLegacy1
{
	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<Integer>();
			myList.add(8);
		    myList.add(6);

			Inserter in = new Inserter();
			in.insert(myList);        //pass list<Long> to Legacy code

	}
}
class Inserter
{
	//method vt a non-gen List arg
	void insert(List list)
	{
		list.add(new String("42"));
	}
}

/*
G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>javac TestBadLegacy1.java
Note: TestBadLegacy1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>java TestBadLegacy1

G:\SCJP\Scjp6\ch7-Genrc&Collkcn\Collection>
*/