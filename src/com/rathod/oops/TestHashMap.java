package com.rathod.oops;
import java.util.*;

public class TestHashMap 
 {
  	public static void main(String args[])
	 {
    	 	HashMap hm = new HashMap(5);

    		hm.put("Jackson Palmer", new Integer(1051));
    		hm.put("Lisa Reid", new Integer(5678));
    		hm.put("Cheryl Spada", new Integer(2345));

    		System.out.println("size of HashMap is " + hm.size());

    		String str = "Jackson Palmer";

    		if (hm.containsKey(str))
		 {
      		System.out.println(str + "'s account number is " + hm.get(str));
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
