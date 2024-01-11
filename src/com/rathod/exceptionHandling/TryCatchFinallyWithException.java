package com.rathod.exceptionHandling;
//Exception raised, it will also execute once to the finally block

class TryCatchFinallyWithException
{
	
	public static void main (String[] args)
		 {
		 	 int a[] = {1, 2, 3,4};
		 		try{
		 			
		 			System.out.println("Hello");  		
		 			System.out.println(10/0);  	
		 		//	System.out.println(a[10]);		
		 		
		 			}/*
		 			catch(ArithmeticException ae)
		 			{
		 				System.out.println("Arithmetic Exception");  
		 				
		 			}
		 			catch(ArrayIndexOutOfBoundsException aie)
		 			{
		 				System.out.println("Array Index out of bound");  
		 				
		 			}
		 			
		 			*/
		 			catch(NullPointerException npe)
		 			{
		 				System.out.println("Null pointer exception Exception");  
		 				
		 			}
		 			
		 			finally
		 			{
		 				System.out.println("finally block called");  
		 				
		 			}
		 	}
}
/*
o/p   :-		Hello
				finally block called
 
Hello
finally block called
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exc_Test16.main(Exc_Test16.java:12)
*/