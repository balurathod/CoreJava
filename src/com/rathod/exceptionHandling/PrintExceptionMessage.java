package com.rathod.exceptionHandling;
// Method to print exception Information
// 1.printStackTrace()	2.toString()	3.getMessage()

class PrintExceptionMessage
{
	public static void main (String[] args)
		 {
		 	 
		 		try{
		 				System.out.println(10/0);  		
		 			}
		 			catch(ArithmeticException ae)
		 			{
		 					ae.printStackTrace();
		 					System.out.println(ae);
		 					System.out.println(ae.toString());  
		 					System.out.println(ae.getMessage());			
		 				}
		 	
	}
}
/*
 1.printStackTrace():-		java.lang.ArithmeticException: / by zero
        								at Exc_Test10.main(Exc_Test10.java:10)		
       
  2.sopln(ae);            :-java.lang.ArithmeticException: / by zero
       
  3.toString()          :-     java.lang.ArithmeticException: / by zero
       
  4.getMeassage()    :-     / by zero
*/