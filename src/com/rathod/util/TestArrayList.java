package com.rathod.util;
import java.util.*;

public class TestArrayList
 {
  public static void main(String args[]) 
       {
       
	ArrayList al = new ArrayList();
       	Integer three = new Integer(3);
       	al.add(new Integer(0));
       	al.add(new Integer(1));
       	al.add(new Integer(2));
       	al.add(three);
       	al.add(new Integer(4));
      	System.out.println("The capacity of al is " + al.size());
      	System.out.println("al now contains " + al);

    	if (al.contains(three))
    	 {
      		System.out.println("al contains three");
      		System.out.println("three is at index " + al.indexOf(three));
   	 } 

    	al.add(0, new Integer(5));
    	System.out.println("The capacity of al is now " + al.size());
    	System.out.println("al now contains " + al);
    	al.remove(1);
    	System.out.println("The capacity of al is now " + al.size());
    	System.out.println("al now contains " + al);
    	al.set(0, three);
    	System.out.println("al now contains " + al);
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

