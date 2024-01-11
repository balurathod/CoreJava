package com.rathod.oops;
import java.util.*;

public class TestCollMax 
  {
  	public static void main(String args[])
	 {
    		ArrayList tmp = new ArrayList();
    		tmp.add(new Integer(0));
    		tmp.add(new Integer(11));
    		tmp.add(new Integer(-2));
    		tmp.add(new Integer(3));

    		Integer max = (Integer) Collections.max(tmp);
    		Integer min = (Integer) Collections.min(tmp);
    		System.out.println("maximum is " + max + " minimum is " + min);
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
