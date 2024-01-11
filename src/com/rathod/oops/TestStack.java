package com.rathod.oops;
 import java.util.*;

public class TestStack
 {
  	public static void main(String args[]) 
	{
    		Stack s = new Stack();

    		s.push("first");
    		s.push("second");
    		s.push("third");

    		String top = (String) s.pop();
    		String newTop = (String) s.peek();
    		String next = (String) s.pop();
    		System.out.println(top + " " + newTop + " " + next);
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
