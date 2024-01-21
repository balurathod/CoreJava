package com.rathod.JavaFeaturesVersionwise.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateAPIAll {
 public static void main(String[] args) {
    //Get the current date
    LocalDate today = LocalDate.now();
    System.out.println("Current date: " + today);

    //add 1 week to the current date
    LocalDate todayWeek = LocalDate.now();
    LocalDateNextWeek = today.plus(1, ChronoUnit.WEEKS);
    System.out.println("Next week: " + todayWeek);


    Calendar cal = Calendar.getInstance();
    Date todays = cal.getTime();
    cal.add(Calendar.YEAR, 1); // to get previous year add -1
    Date nextYear = cal.getTime();


    //Creating LocalDate by providing input arguments
		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay_2014);
		
		
		//Try creating date by providing invalid inputs
		//LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		//Exception in thread "main" java.time.DateTimeException: 
		//Invalid date 'February 29' as '2014' is not a leap year
		
		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);

		//java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		//LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
		
		//Getting date from the base date i.e 01/01/1970
		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= "+dateFromBase);
		
		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100th day of 2014="+hundredDay2014);

 }   
}
