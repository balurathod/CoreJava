package com.rathod.oops;
import java.util.*;

public class TestCollShuffle 
  {
  	public static void main(String args[]) 
	{
    		ArrayList al = new ArrayList();

    		al.add(new Integer(0));
    		al.add(new Integer(11));
    		al.add(new Integer(-2));
    		al.add(new Integer(3));

    		Collections.shuffle(al);
    		System.out.println("Contents of al are " + al);
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
