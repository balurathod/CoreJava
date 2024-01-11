package com.rathod.oops;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestLeapYear extends Thread{

	public static void main(String[] args) {  
	  String months[] = {
      "Jan", "Feb", "Mar", "Apr",
      "May", "Jun", "Jul", "Aug",
      "Sep", "Oct", "Nov", "Dec"};
      
      int year;
      // Create a Gregorian calendar initialized
      // with the current date and time in the
      // default locale and timezone.
      GregorianCalendar gcalendar = new GregorianCalendar();
      // Display current time and date information.
      System.out.print("Date : ");
      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
      System.out.println(year = gcalendar.get(Calendar.YEAR));
      try{
          while(true){
      System.out.print("Time : ");
      GregorianCalendar gcalendar1 = new GregorianCalendar();
      System.out.print(gcalendar1.get(Calendar.HOUR));
      System.out.print(":" + gcalendar1.get(Calendar.MINUTE));
      System.out.println(":" +gcalendar1.get(Calendar.SECOND));
      
      Thread.sleep(5*1000);
      }
      }catch(Exception e){
    	  e.printStackTrace();
      }
      // Test if the current year is a leap year
      if(gcalendar.isLeapYear(year)) {
         System.out.println("The current year is a leap year");
      }
      else {
         System.out.println("The current year is not a leap year");
      }
	}
}
