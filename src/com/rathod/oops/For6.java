package com.rathod.oops;
class For6 
{
	static boolean doStuff()
	{
		for (int x = 0 ; x < 3 ; x++ )
		{
			System.out.println("In FOR loop...");
        
		//return true;  
		}
		//break;
		System.exit();   //why we cant apply here? bcz it is unreachable st.
	}
	
}