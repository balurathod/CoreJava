package com.rathod.oops;
import java.util.*;

public class TestIterator
  {
  	public static void main(String args[]) 
	{
    		HashMap hm = new HashMap();

    		hm.put("Jackson Palmer", new Integer(1051));
    		hm.put("Lisa Reid", new Integer(5678));
    		hm.put("Cheryl Spada", new Integer(2345));
    		hm.put("Anne Palmer", new Integer(4567));

    		Set st = hm.entrySet();

    		Iterator it = st.iterator();

    		while (it.hasNext())
		 {
      			Map.Entry me = (Map.Entry) it.next();
      			System.out.println("name: " + me.getKey() + " acct number: " + me.getValue());
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
