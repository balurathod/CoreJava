package com.rathod.oops;
class TimeTravel 
{
	public static void main(String[] args) 
	{
		//int year = 2050;    //loc var always always must b initialized.
        
		//int year ;         //give err as fallo.
		
		System.out.println("Follo r legal" + b);   //not posibl bcz u initilize b at bottum & u say to compiler first execut it.
		int year;                                  //in a block/body execution  flow  is always straight forward.
		                                            //(top - bottum only-cursor never return back in a body/block ).
		  
		  year=2020;        //legal
		

		System.out.println("the year is " + year);
		int b=345;
	}
}
/*

G:\SCJP\Scjp6\ch3-Assignmnt>javac TimeTravel.java
TimeTravel.java:9: variable year might not have been initialized
                System.out.println("the year is " + year);
                                                    ^
1 error


*/