package com.rathod.util;
import java.util.*;

public class TestGC
  {
 	public static void main(String args[]) 
	{
    		GregorianCalendar gc = new GregorianCalendar();

    		int year = gc.get(Calendar.YEAR);
		System.out.println(gc);
    		
		if (gc.isLeapYear(year))
		 {
      		          System.out.println(year + " is a leap year");
    		}
		 else
		 {
      		         System.out.println(year + " is not a leap year");
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