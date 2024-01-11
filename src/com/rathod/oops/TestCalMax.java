package com.rathod.oops;
import java.util.*;

public class TestCalMax 
  {
  	public static void main(String args[])
	 {
    	       Calendar c1 = Calendar.getInstance();

    	       int max = c1.getMaximum(Calendar.DAY_OF_MONTH);
    	       int leastMax = c1.getLeastMaximum(Calendar.DAY_OF_MONTH);

    	       System.out.println("maximum days in month are " + max);
    	       System.out.println("least maximum days in month are " + leastMax);
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
