package com.rathod.util;
import java.util.*;

public class TestDateComp
   {
  	public static void main(String args[]) 
	{
    		Date d1 = new Date();
    		
		try
		 {    
      		     Thread.sleep(500);
    		}
    		catch (InterruptedException ie) 
		{}
	
		Date d2 = new Date();

    		if ( d1.before(d2) )
      		System.out.println("d1 came before d2");
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
