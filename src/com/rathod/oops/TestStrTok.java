package com.rathod.oops;
import java.util.*;

public class TestStrTok
  {
  	public static void main(String args[])
	 {
    		String request = "I want Halibut for dinner";
    		String fish;

    		StringTokenizer stringParse = new StringTokenizer(request);

    		try 
		{
	
      		     while (stringParse.hasMoreTokens())
		     {
        			fish = stringParse.nextToken();

        			if (fish.equals("Halibut"))
			 {
          			System.out.println(fish);
        			} 
      		     } 
    		} 
		  catch (NoSuchElementException e) 
		   {
      		          System.out.println(e);
    			
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