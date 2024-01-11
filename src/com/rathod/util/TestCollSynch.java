package com.rathod.util;
import java.util.*;

public class TestCollSynch 
  {
  	public static void main(String args[])
	 {
    		SortedSet ss = Collections.synchronizedSortedSet(new TreeSet());

     		ss.add("Mark");
    		ss.add("Maria");
    		ss.add("Scott");
    		ss.add("Diana");
    		System.out.println("The first element is " + (String) ss.first());
    		System.out.println("The last element is " + (String) ss.last());
  	} 
  }
/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/
