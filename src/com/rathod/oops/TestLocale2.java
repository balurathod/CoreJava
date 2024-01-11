package com.rathod.oops;
import java.util.*;

public class TestLocale2 
{
  	public static void main(String args[])
	 {
    		Locale.setDefault(Locale.FRANCE);
    		Locale l = Locale.getDefault();

    		System.out.println("country is " + l.getDisplayCountry());
    		System.out.println("language is " + l.getDisplayLanguage());
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
