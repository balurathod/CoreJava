package com.rathod.exceptionHandling;
// With exception Handling
class ARIException
{
	public static void main (String[] args)
		 {
		 	System.out.println("Hi");
		 	try{
		 			System.out.println(10/0);
		 			
		 		}
		 		catch(ArithmeticException ae)
		 		{
		 				System.out.println(10/2);			
		 			}
		 	System.out.println("Hello");
	}
}
/*
o/p = : Hi
			5
			Hello	
			*/