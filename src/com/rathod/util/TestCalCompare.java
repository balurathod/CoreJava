package com.rathod.util;
import java.util.*;

public class TestCalCompare
  {
  	public static void main(String args[])
	 {
    	     Calendar c1 = Calendar.getInstance();
    	
	  	try 
	             	{    
      	      	     Thread.sleep(500);
    		}
    		
		catch (InterruptedException ie)
		 {}
    
		Calendar c2 = Calendar.getInstance();

    		         if (c1.before(c2))
		        {
      			System.out.println("c1 came before c2");

    		        } 
    		Calendar c3 = (Calendar) c1.clone();
    			
			if (c1.equals(c3)) 
			{
      			      System.out.println("c1 and c3 are equal");
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