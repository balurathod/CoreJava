package com.rathod.oops;
import java.util.*;

public class TestCollFill 
  {
  	public static void main(String args[])
	 {
    		ArrayList tmp = new ArrayList();
    		tmp.add("Mark");
    		tmp.add("Maria");
    		tmp.add("Scott");
    		tmp.add("Diana");

    		Collections.fill(tmp, "Bailey");
    		System.out.println("The size of tmp is " + tmp.size());
    		System.out.println("The contents of tmp are: " + tmp);
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
