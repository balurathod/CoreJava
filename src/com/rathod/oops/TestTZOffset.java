package com.rathod.oops;
import java.util.*;

public class TestTZOffset 
{
  	public static void main(String args[])
	 {
    		TimeZone tz = TimeZone.getDefault();

    		int offset = tz.getRawOffset();

    		// Convert offset from milliseconds to hours
    		offset = offset / (1000 * 3600);
    		System.out.println("The offset from local to GMT is " + offset);
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