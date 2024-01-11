package com.rathod.oops;
import java.util.*;

public class TestTZdst 
{
  	public static void main(String args[])
	 {
    		TimeZone tz = TimeZone.getDefault();

    		if (tz.inDaylightTime(new Date())) 
		{
      			System.out.println("We are in daylight savings time");
    		}
		 else 
		   {
      			System.out.println("We are not in daylight savings time");
    		    }

    		if (tz.useDaylightTime()) 
		{
      			System.out.println("This time zone uses daylight savings time");
    		}
		 else 
		{
      			System.out.println("This time zone does not use dst");
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
