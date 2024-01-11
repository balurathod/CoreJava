package com.core;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
public static void main(String[] args) {
	Date date=new Date();
	
	long lEnterTime = new Date().getTime();
	
	/*System.out.println("*********"+lEnterTime);
	System.out.println(date.getTime());
	System.out.println(date.getYear());
	System.out.println(new Date().getTime());
	
	System.out.println();
	long timee=System.currentTimeMillis();
	SimpleDateFormat sdf=new SimpleDateFormat("HH:MM:SS");
	String timestamp=sdf.format(timee);
	System.out.println(timestamp);
	
	System.out.println("sdflfjlsdlfjs");
	System.out.println("sjfsjdlflsjl");
	System.out.println("sdff");
	
	
	long timee1=System.currentTimeMillis();
	SimpleDateFormat sdf1=new SimpleDateFormat("HH:MM:SS");
	String timestamp1=sdf.format(timee);
	System.out.println(timestamp1);*/
	
	try{
		Thread.sleep(610000);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	long lExitTime = new Date().getTime();
	System.out.println("*********"+lExitTime);
	
	System.out.println("*********"+(lExitTime - lEnterTime));
	long ti=((lExitTime - lEnterTime));
	if(ti>600000){
		System.out.println("done");
	}
	else{
	System.out.println(ti);
	}
}
}
