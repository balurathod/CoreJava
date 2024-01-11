package com.rathod.oops;
import java.util.*;
class  Calendar1
{
	public static void main(String[] args) 
	{
		Calendar c =  Calendar.getInstance();
	    //c.add(13/12/2010);
		//c.add(04:31:34);
		System.out.println("Calender is " + c);
		//System.out.println("Calender is " + c.add());
		//System.out.println("Calender is " + c.add());
	}
}
/*

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\DateNum&Currncy>javac Calendar1.java

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\DateNum&Currncy>java Calendar1
Calender is java.util.GregorianCalendar[time=1293000791272,areFieldsSet=true,
areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="America/
Los_Angeles",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,
lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,
dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8
,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1
,endDayOfWeek=1,endTime=7200000,endTimeMode=0]],firstDayOfWeek=1,
minimalDaysInFirstWeek=1,ERA=1,YEAR=2010,MONTH=11,WEEK_OF_YEAR=52,WEEK_OF_MONTH=4,
DAY_OF_MONTH=21,DAY_OF_YEAR=355,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,
HOUR=10,HOUR_OF_DAY=22,MINUTE=53,SECOND=11,MILLISECOND=272,ZONE_OFFSET=-28800000,
DST_OFFSET=0]

G:\SCJP\Scjp6\ch6-Str IO Formtng Parcng\DateNum&Currncy>

*/