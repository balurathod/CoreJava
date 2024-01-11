package com.rathod.exceptionHandling;


class MultiCatchHierarchyOk
{
	
	public static void main (String[] args)
		 {
		 	 int a[] = {1, 2, 3,4};
		 		try{
		 			
		 			System.out.println("Hello");  		
		 			//System.out.println(10/0);  	
		 			System.out.println(a[10]);		
		 		
		 			}
		 			catch(ArithmeticException ae)
		 			{
		 				System.out.println("Arithmetic Exception");  
		 				
		 			}
		 			
		 			catch(Exception e)
		 			{
		 				System.out.println("Array index out of bound");  
		 				
		 			}
		 	}
}
/*
o/p:-
10/0         :-
Hello
Arithmetic Exception	 	

a[10]
Hello
Array index out of bound

*/