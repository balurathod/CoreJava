package com.rathod.oops;
import java.util.*;

public class TestDateTime 
  {
  	public static void main(String args[])
	 {
    	  	Date d = new Date();
    		System.out.println("time is now " + d.toString());
    		System.out.println();

    	      try 
	      {
      		Thread.sleep(5000);
    	      } 
	     catch (Exception e)
	      {}

    		d.setTime(System.currentTimeMillis());
    		System.out.println("time is now " + d.toString());
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
