package com.rathod.oops;
class StringTest  
{
	public static void main(String[] args) 
	{
		String x = "JAVA";
		String y = x;          //x & y refer to same String
		
		System.out.println(" x string = " + x);
		System.out.println(" y string = " + y);
		
		
		x = x + "Bean";
		System.out.println(" y string = " + y);
        System.out.println(" x  aftr modifkcn string = " + x); 

		y = y + "Bean";
        System.out.println(" yy string = " + y); 

	
	
	}
}
