package com.rathod.util;
import java.util.*;

public class TestCollReverse
   {
  	public static void main(String args[]) 
	{
    		Comparator c = Collections.reverseOrder();

    		TreeSet ts = new TreeSet(c);

    		ts.add(new Integer(0));
    		ts.add(new Integer(11));
    		ts.add(new Integer(-2));
    		ts.add(new Integer(3));

    		System.out.println("Contents of ts are " + ts);
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
