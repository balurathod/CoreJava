package com.rathod.oop;
//4-ways to show date
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateEx {
	public static void main(String args[]){
		
		//To get current date 1 - way
		java.util.Date date=new java.util.Date();  
		System.out.println(date);  
		System.out.println(date.getTime());  //to get current time
		
		//To get current date 2 - way
		long millis=System.currentTimeMillis();  
		//System.out.println(millis);  
		java.util.Date date1=new java.util.Date(millis);  
		System.out.println(date1);  
		
		//To get current date 3 - way
		java.util.Date date3=java.util.Calendar.getInstance().getTime();  
		System.out.println(date3); 
		
		long millisec=System.currentTimeMillis(); 
		//System.out.println(millisec);  
		java.sql.Date date2=new java.sql.Date(millisec);  
		System.out.println(date2);   
		
		
		//converting string into sql date 
		String str="2015-03-31";  
		java.sql.Date date4=java.sql.Date.valueOf(str); 
	    System.out.println(date4);  
	    
	  //convert string into date using java.text.DateFormat class.
	    java.util.Date d;
		try {
			d = java.text.DateFormat.getDateInstance().parse("31 Mar, 2015");
			System.out.println("Date is: "+d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
  
		//To convert string into date using java.text.SimpleDateFormat class.
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    try {  
	        java.util.Date date7 = formatter.parse("31/03/2015");  
	        System.out.println("Date is: "+date);  
	    } catch (ParseException e) {e.printStackTrace();}  
		
		
		//To  format date in java using java.text.SimpleDateFormat class.
		java.util.Date date5 = new java.util.Date();  
		java.text.SimpleDateFormat formatter1 = new java.text.SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter1.format(date5);  
	    System.out.println(strDate);  
	    
	    //To format date and time in java using java.text.SimpleDateFormat class.
	    java.util.Date date6 = new java.util.Date();  
	    SimpleDateFormat formattr = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate1 = formattr.format(date6);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate1);  
	  
	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
	  
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
	    
	    //
	    java.util.Date currentDate = new java.util.Date();  
        System.out.println("Current Date: "+currentDate);  
        String dateToStr = java.text.DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr); 
        
        dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
	
        
	
	}
}
