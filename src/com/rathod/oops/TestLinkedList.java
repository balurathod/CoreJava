package com.rathod.oops;
import java.util.*;

public class TestLinkedList 
{
  	public static void main(String args[])
	 {
    		LinkedList llist = new LinkedList();

    		llist.add(new Integer(1));
    		llist.add(new Integer(2));
    		llist.add(new Integer(3));
    		llist.add(new Integer(4));
    		llist.addFirst(new Integer(0));
    		System.out.println("The capacity of llist is " + llist.size());
    		System.out.println("llist now contains " + llist);

    		Integer iobj = (Integer) llist.get(1);
    		llist.set(1, new Integer(iobj.intValue() + 5));

    		llist.removeLast();

    		System.out.println("llist now contains " + llist);
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
