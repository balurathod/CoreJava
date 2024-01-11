package com.rathod.oops;
import java.util.*;

public class TestCalRoll 
  {
  	public static void main(String args[])
	 {
    		Calendar c = Calendar.getInstance();

    		System.out.println("date is " + c.get(Calendar.DATE));

    		c.roll(Calendar.DATE, true);
    		System.out.println("date is now " + c.get(Calendar.DATE));
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