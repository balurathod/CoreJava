package com.rathod.multiThreading;

import java.util.*;

public class HelloThreadTimer extends Thread {

	public static void main(String[] args) {	    
		try {
		      while (true) {
		          System.out.print(new String("Hello world! Time :  "));
		          GregorianCalendar gcalendar1 = new GregorianCalendar();
			      System.out.print(gcalendar1.get(Calendar.HOUR) + ":");
			      System.out.print(gcalendar1.get(Calendar.MINUTE) + ":");
			      System.out.println(gcalendar1.get(Calendar.SECOND));
		          Thread.sleep(5 * 1000); // every 5 seconds
		      }
	    } catch (InterruptedException e) {
	    	 e.printStackTrace();
	    }		
	}
}
