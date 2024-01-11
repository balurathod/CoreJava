package com.rathod.exceptionHandling;
//Test in Finally

class TryCatchFinally
{
	
	public static void main (String[] args)
		 {
		 	 int a[] = {1, 2, 3, 4};
		 		try{
		 			
		 			System.out.println("Hello");  		
		 			System.out.println("try " + 10/0);  	
		 			System.out.println("try " + a[10]);		
		 		
		 			}
		 			catch(ArithmeticException  | ArrayIndexOutOfBoundsException aie)
		 			{
		 				System.out.println("catch ");
		 				System.out.println("catch " + a[10]);
		 				System.out.println("Arithmetic Exception or Array Index out of bound");  
		 				//aie.printStackTrace();		 				
		 				
		 			}
		 			
		 			finally
		 			{
		 				System.out.println("before finally block called");
		 				System.out.println("finally " + 10/0);
		 				System.out.println("finally block called");  
		 				
		 			}
		 	}
}
/*
o/p:-
Hello
Arithmetic Exception
finally block called

Hello
Array Index out of bound
finally block called

*/