package com.rathod.util;
import java.util.*;
public class TestLocale 
  {
  	public static void main(String args[])
	 {
    		Locale l = Locale.FRANCE;
    		System.out.println("country is " + l.getDisplayCountry());
    		System.out.println("language is " + l.getDisplayLanguage());
    		Locale.setDefault(Locale.FRANCE);
    		System.out.println("language is " + l.getDisplayLanguage());
    		System.out.println("country is " + l.getDisplayCountry());

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