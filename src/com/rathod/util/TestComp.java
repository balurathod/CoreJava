package com.rathod.util;
import java.util.*;

class NewComp implements Comparator 
  {
  	public int compare(Object obj1, Object obj2)
	 {
    		int i, j, k;

    		String str1 = (String) obj1;
    		String str2 = (String) obj2;

    		i = str1.lastIndexOf(' ');
    		j = str2.lastIndexOf(' ');

    		k = str1.substring(i).compareTo(str2.substring(j));
    		
		if (k == 0) 
		{
      		return str1.compareTo(str2);
    		}
		 else 
		{
      		return k;
    		}
  	} 
  }

	public class TestComp 
	{
  		public static void main(String args[]) 
		{
    		          	TreeSet ts = new TreeSet(new NewComp());

    			ts.add("Zachary Palmer");
    			ts.add("Lisa Reid");
    			ts.add("Anne Palmer");
    			ts.add("Diana Davis");

    			System.out.println("ts contains " + ts);
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