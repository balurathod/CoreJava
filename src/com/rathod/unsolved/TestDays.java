package com.rathod.unsolved;
public class TestDays 
{
	public enum Days {MON,TUE,WED} ;

	public static void main(String[] args) 
	{
		for(Days d:Days.values());
		Days [] d2=Days.values();

		System.out.println(d2[2]);
	}
}
 //B) WED    how? Explain?