package com.rathod.util;
import java.util.*;

public class TestCalClear
    {
  	public static void main(String args[])
	 {
    		Calendar c = Calendar.getInstance();

    		if (c.isSet(Calendar.DATE))
		 {
      		        System.out.println("date is set");

   		 } 
    		c.clear();

    		    if (c.isSet(Calendar.DATE)) 
		    {
      		           System.out.println("date is set");
    		     } 
		   else
 		    {
    		    System.out.println("date is " + c.get(Calendar.DATE));
    		    System.out.println("date is " + c.get(Calendar.MONTH));
    	                     System.out.println("date is " + c.get(Calendar.YEAR));
      		    System.out.println("date is not set");
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
