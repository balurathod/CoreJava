package com.rathod.exceptionHandling;
//try with return statement, it will also execute once to the finally block

class TryWithReturn
{
	
	public static void main (String[] args)
		 {
		 	 int a[] = {1, 2, 3,4};
		 		try{
		 			
		 			System.out.println("try");  		
		 			return ;
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