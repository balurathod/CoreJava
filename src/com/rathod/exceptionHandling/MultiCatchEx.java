package com.rathod.exceptionHandling;
//Exception with multiple catch

class MultiCatchEx
{
	
	public static void main (String[] args)
		 {
		 	 int a[] = {1,2,3,4};
		  		try{
		  			System.out.println("Hello");  		
		 			//System.out.println(10/0);  	
		 			System.out.println(a[10]);		
		 		
		 			}
		 			catch(ArithmeticException ae)
		 			{
		 				System.out.println("Arithmetic Exception");  
		 				
		 			}
		 			
		 			catch(ArrayIndexOutOfBoundsException ai)
		 			{
		 				System.out.println("Array Index out of bound");  
		 				
		 			}	
		 			
	}
}/*
o/p- 			System.out.println(10/0);--------->

				Hello
				Arithmetic Exception

	System.out.println(a[10]);		----------->
		Hello
		Array Index out of bound	
		
		*/