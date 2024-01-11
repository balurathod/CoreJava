package com.rathod.oops;
import java.util.*;

public class TestArraysSearch 
  {
  	public static void main(String args[]) 
	{
    		int[] intArray = {0, 1, 2, 3, 4};

    		int i = 11;
    		int index = Arrays.binarySearch(intArray, i);
    		
		if (index >= 0)
		 {
      		            System.out.println("value " + i + " is at index " + index);
    		}
		 else
		 {
      		          System.out.println("array does not contain value " + i);
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
