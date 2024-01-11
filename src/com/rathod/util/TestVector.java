package com.rathod.util;
import java.util.*;

public class TestVector 
{
  	public static void main(String args[]) 
	{
    		Vector v = new Vector();

    		v.addElement("Lisa");
    		v.addElement("Jackson");
    		v.addElement("Zachary");
    		v.addElement("Mark");

    		v.insertElementAt("Ryan", 3);
    		System.out.println("size of v is " + v.size());
    		System.out.println("contents of v are " + v);

    		String str = "Jackson";
    		int index = v.indexOf(str);
    		System.out.println(str + " is at index " + index);

    		v.setElementAt("Julia", 2);
    		v.removeElement("Mark");
    		System.out.println("size of v is now " + v.size());
    		System.out.println("the capacity of v is now " + v.capacity());
    		System.out.println("contents of v are now " + v);
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
