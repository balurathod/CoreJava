package com.rathod.unsolved;
//Calendar  is abstract class
import java.util.*;
class  Dates
{
	public static void main(String[] args) 
	{
		Date d = new Date(100000000000L);
		System.out.println("1st Date " + d.toString());
		
		Calendar c = new Calendar.getInstance();   //err...
		c.setTime(d);                                   //1

		if (Calendar.SUNDAY == c.getFirstDayOfWeek())   //2 
		
			System.out.println("Sunday is the first day of Week");  
            System.out.println("Trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK));//3
			
			c.add(Calendar.MONTH,1);                     //4 
			Date d1 = c.getTime();                      //5
			System.out.println("new date" + d1.toString());

	}
}
//not compile...