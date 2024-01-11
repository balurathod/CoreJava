package com.rathod.oops;
import java.util.*;

public class TestCalTime 
  {
  	public static void main(String args[])
	 {
    		Calendar c = Calendar.getInstance();
    		System.out.println("hour: " + c.get(Calendar.HOUR));
    		System.out.println("minute: " + c.get(Calendar.MINUTE));
    		System.out.println("seconds: " + c.get(Calendar.SECOND));
    		System.out.println(" ");

    		try 
		{
      		    Thread.sleep(5000);
    		} 
		catch (Exception e) {}

    		Date d = new Date(System.currentTimeMillis());
    		c.setTime(d);
    		System.out.println("hour: " + c.get(Calendar.HOUR));
    		System.out.println("minute: " + c.get(Calendar.MINUTE));
    		System.out.println("seconds: " + c.get(Calendar.SECOND));
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