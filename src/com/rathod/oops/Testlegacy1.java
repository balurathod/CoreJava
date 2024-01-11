package com.rathod.oops;
import java.util.*; 
class  TestLegacy1
{
	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(4);
		myList.add(6);

		TestLegacy1 tl = new TestLegacy1();

		int total = tl.addAll(myList); //pas it to an untyped arg. 

		System.out.println("Total!" + total);

	}

	int addAll(List list)   //legacy metd(special)-a gift of proprty....
	{
		//metd vt non-gen List arg
		//bt asum (vt no garnty) tat it vl b Intgrs
		Iterator it = list.iterator();
		int total = 0;
		while (it.hasNext())
		{
			int i = ((Integer)it.next()).intValue();
			total += i;
		}
		return total;
	}

}
