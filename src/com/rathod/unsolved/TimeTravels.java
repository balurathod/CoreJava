package com.rathod.unsolved;
import java.util.Date;
public class TimeTravels
{
	public static void main(String[] args) 
	{
		//Date date;         //loc refs r not given a default val of null (they r not null  ) 
		
		//Date date = null;
			Date date ;	   // how to provide val to date ref?
				           //incompatible types-12/10/2010;
		if (date==null)
				System.out.println("Date is null " + date);
	}
}
/*

G:\SCJP\Scjp6\ch3-Assignmnt>javac TimeTravels.java
TimeTravels.java:7: variable date might not have been initialized
                if (date==null)
                    ^
1 error

*/