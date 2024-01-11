package com.rathod.multiThreading;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ThreadTimeEx {

	public static void main(String[] args) {
		System.err.println(" Thread printing Hello after 5 Seconds");
		try{
			while (true) {
				
				GregorianCalendar gc = new GregorianCalendar();
				System.out.println();
				System.out.print( "Hello India! " );
				System.out.print( gc.get(Calendar.HOUR)+":");
				System.out.print( gc.get(Calendar.MINUTE)+":" );
				System.out.print( gc.get(Calendar.SECOND));
				Thread.sleep(5*1000L);				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
