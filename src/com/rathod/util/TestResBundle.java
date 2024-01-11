package com.rathod.util;
import java.util.*;

public class TestResBundle 
 {
   	public static void main(String args[]) 
	{
      		ResourceBundle rb = 
          		ResourceBundle.getBundle("Colors", Locale.ENGLISH);
      		String str = rb.getString("red");
      		System.out.println("In English, red is " + str);

      		rb = ResourceBundle.getBundle("Colors", Locale.FRENCH);
      		str = rb.getString("red");
      		System.out.println("In French, red is " + str);
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
