package com.rathod.exceptionHandling;
//try with JVM shut down, it will not execute to the finally block
//that is the only condition where JVM not executes the finally block, because JVM is shut down

class TryWithFinallyButNotExecuting
{
	
	public static void main (String[] args)
		 {
	 		try{
		 			
		 			System.out.println("try");  		
		 			System.exit(0) ;
		 			}
		 			catch(ArithmeticException ae)
		 			{
		 				System.out.println("catch block executed");  
		 				
		 			}
		 			
		 			finally
		 			{
		 				System.out.println("finally block called");  
		 				
		 			}
		 	}
}