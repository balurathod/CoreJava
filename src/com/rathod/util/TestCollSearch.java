package com.rathod.util;
import java.util.*;

public class TestCollSearch 
  {
  	public static void main(String args[])
	 {
    		ArrayList tmp = new ArrayList();
    		tmp.add("Mark");
    		tmp.add("Maria");
    		tmp.add("Scott");
    		tmp.add("Diana");

    		String str = "Maria";
    		int pos = Collections.binarySearch(tmp, str);
    		System.out.println("Maria is at position " + pos);
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
