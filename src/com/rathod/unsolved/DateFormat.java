package com.rathod.unsolved;

//Check her for jmport n methods

class DateFormat1 
{
    	DateFormat df;
		Date date=new Date();
     //code here...
        df=DateFormat.getInstance();
	    String s=df.format(date);
			
	
	public static void main(String[] args) 
	{
		System.out.println("Val of b = " + b);
		System.out.println("Val of s= " + s);
	}
}
/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac DateFormat.java
DateFormat.java:7: <identifier> expected
        df=DateFormat.getInstance();
          ^
1 error
*/