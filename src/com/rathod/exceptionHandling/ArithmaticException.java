package com.rathod.exceptionHandling;

class ArithmaticException
{
	public static void main (String[] args)
		 {
		 	doStuff();
		}
	public static void doStuff()
	{	
		doMoreStuff();
	//	System.out.println(10/0);
		
	
	}
	public static void doMoreStuff()
	{
			System.out.println(10/0);
	}
}
