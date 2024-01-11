package com.rathod.oops;
import java.util.*;

public class TestHashtable
   {
  	public static void main(String args[]) 
	{
    		Hashtable ht = new Hashtable();

    		ht.put("Jackson Palmer", new Integer(1051));
    		ht.put("Lisa Reid", new Integer(5678));
    		ht.put("Cheryl Spada", new Integer(2345));

    		System.out.println("size of Hashtable is " + ht.size());

    		String str = "Jackson Palmer";

    		if (ht.containsKey(str))
		 {
      		System.out.println(str + "'s account number is " + ht.get(str));
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
