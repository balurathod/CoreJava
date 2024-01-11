package com.rathod.oops;
import java.util.*;

public class Colors_en extends ResourceBundle 
{
   	protected Object handleGetObject(String key)
	 {
     	if (key.equals("red"))
        	return "Red";
     	if (key.equals("black"))
        	return "Black";
     	return null;
  	}

  	public Enumeration getKeys()
                      {
    	     Vector v = new Vector();
                       v.addElement("red");
                      v.addElement("black");
       	     return v.elements();
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