package com.rathod.util;
import java.util.*;

public class TestEvent
 {
  	public static void main(String args[])
	 {
    		String str = "Jackson";

     		EventObject evtObj = new EventObject(str);

    		System.out.println("" + evtObj.getSource() + " generated the event");
    		System.out.println("the event is: " + evtObj.toString());
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
