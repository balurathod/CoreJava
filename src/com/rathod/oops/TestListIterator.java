package com.rathod.oops;
import java.util.*;

public class TestListIterator 
  {
  	public static void main(String args[])
	 {
    		ArrayList al = new ArrayList();

    		al.add("Jackson");
    		al.add("Zachary");
    		al.add("Lisa");
    		al.add("Weesa");

    		ListIterator li = al.listIterator();

    		while (li.hasNext()) 
		{
      			if (li.nextIndex() == 1) 
			{
        			      li.add("Bailey");
        			     li.next();
      			} 
		li.next();
    		} 

    			while (li.hasPrevious()) 
			{
      			     System.out.println(li.previous());
   			 } 
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
