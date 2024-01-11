package com.rathod.oops;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CuttoffEx {
	public static void main(String[] args) throws Exception {
		String ldate="10/12/2013";
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		Timestamp timestamp=new Timestamp(12012013);
		String s=sdf.format(timestamp.toString());
		System.out.println(s);
		Date cutoffdt1=sdf.parse(ldate);
		System.out.println(cutoffdt1);
		Calendar cal = Calendar.getInstance();
		cal.setTime(cutoffdt1);
		String cutOffTimeMargin ="600";
		System.out.println(Calendar.MINUTE);
	
		cal.add(Calendar.MINUTE, -Integer.parseInt(cutOffTimeMargin));
		Date dateWitCutOffMargin = cal.getTime();
		System.out.println("dateWitCutOffMargin :"+dateWitCutOffMargin);
	}

}
