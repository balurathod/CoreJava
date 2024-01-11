package com.rathod.oops;
import java.util.*;
class  TestDates1
{
	public static void main(String[] args) 
	{
		Date d1 = new Date(1000000000000L);    //a trillion.
		Date now = new Date();
		System.out.println("Get Time no. some where bet 1 to 2 trillion " + now.getTime());
		System.out.println("1st Date !" + d1.toString());
        d1.setTime(d1.getTime()+ 3600000);    //3600000 millis/hrs
		System.out.println("new time !" + d1.toString());

	}
}
