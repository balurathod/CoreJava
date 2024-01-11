package com.rathod.exceptionHandling;
//ArithmeticException has already been caught

class MultiCatchHierarchy
{
	
	public static void main (String[] args)
		 {
		 	 int a[] = {1, 2, 3,4};
		 		try{
		 			
		 			System.out.println("Hello");  		
		 			System.out.println(10/0);  	
		 			System.out.println(a[10]);		
		 		
		 			}
		 			catch(Exception e)
		 			{
		 				System.out.println("Exception is a parent class of all exception");  
		 				
		 			}
		 			catch(ArithmeticException ae)
		 			{
		 				System.out.println("Arithmetic Exception");  
		 				
		 			}
		 	}
}/*
CE:-
Exc_Test12.java:21: exception java.lang.ArithmeticException has already been caught
                                        catch(ArithmeticException ae)
                                        ^
1 error
	*/	 	