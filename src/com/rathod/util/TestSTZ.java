package com.rathod.util;
import java.util.*;

public class TestSTZ 
{
  	public static void main(String args[])
	 {
    		SimpleTimeZone stz = (SimpleTimeZone) TimeZone.getDefault();
    		System.out.println(stz.getDisplayName());

    		// Convert 5 hours into milliseconds.
    		int time = 5 * 3600 * 1000;
    		stz.setStartRule(Calendar.MAY, 1, Calendar.SUNDAY, time);

    		// Convert daylight savings from milliseconds into hours
    		int dstOffset = stz.getDSTSavings() / (1000 * 3600);
    		System.out.println("Daylight Savings time savings = " + dstOffset);
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