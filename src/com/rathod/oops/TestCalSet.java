package com.rathod.oops;
import java.util.*;

public class TestCalSet 
  {
  	public static void main(String args[]) 
	{
    	       	Calendar c = Calendar.getInstance();

    		c.set(1947, Calendar.MARCH, 10,0,0,0);

    		System.out.println("year is now " + c.get(Calendar.YEAR));
    		System.out.println("month is now " + c.get(Calendar.MONTH));
    		System.out.println("date is now " + c.get(Calendar.DATE));
    		System.out.println(c);
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
