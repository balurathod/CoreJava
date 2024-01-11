package com.rathod.oops;
//The older  genric  class use vt non-gen code......
import java.util.*; 
class  Adder
{
	int addAll(List list)   //legacy metd(special)-a gift of proprty....
	{
		//metd vt non-gen List arg
		//bt asum (vt no garnty) tat it vl b Intgrs
		Iterator it = list.iterator();
		int total = 0;
		while (it.hasNext()) // hasNext()-check bool val of next ele is presnt or not in index
		{
			int i = ((Integer)it.next()).intValue();  //next()-if (hasNext())true then print it. 
			total += i;
		}
		return total;

	}
///			public static void main(String h[]){} 
}