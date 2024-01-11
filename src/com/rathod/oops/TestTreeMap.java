package com.rathod.oops;
import java.util.*;

public class TestTreeMap
 {
  	public static void main(String args[]) 
	{
    		TreeMap tm = new TreeMap();

    		tm.put("Jackson Palmer", new Integer(1051));
    		tm.put("Lisa Reid", new Integer(5678));
    		tm.put("Cheryl Spada", new Integer(2345));

    		System.out.println("size of TreeMap is " + tm.size());

    		String str = "Jackson Palmer";

    		if (tm.containsKey(str)) 
		{
      			System.out.println(str + "'s account number is " + tm.get(str));
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
