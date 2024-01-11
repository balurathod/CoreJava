package com.rathod.exceptionHandling;
// If Exception raised at Hello statement and corresponding catch block is available

class TryWithException
{
	public static void main (String[] args)
		 {
		 	 
		 		try{
		 			System.out.println("Hi");  		
		 			System.out.println(10/0);
		 			System.out.println("Suresh");  
		 			}
		 		catch(Exception e )
		 		{
		 		
		 				System.out.println(10/2);			
		 		}	
		 	System.out.println("Ramesh");
	}
}

/*o/p   :-Normal Termination
	Hi
	5
	Ramesh
	*/