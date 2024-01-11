package com.rathod.oops;
import java.util.*;

public class TestCollUnm
   {
  	public static void main(String args[]) 
	{
    		ArrayList tmp = new ArrayList();
    		tmp.add("Mark");
    		tmp.add("Maria");
    		tmp.add("Scott");
    		tmp.add("Diana");

    		List l = Collections.unmodifiableList(tmp);

    		String str = (String) l.get(0);
    		System.out.println("The first element is " + str);

    		try 
		{
      		        l.set(1, "Bailey");
    		} 
		catch (UnsupportedOperationException e) 
		{
      		        System.out.println("List is unmodifiable");
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
