package com.rathod.oops;
class C22 
{
	public static void main(String a[] ) 
	{
		int i1=9;
		int i2;if (i1>3)
		{
			i2=8;
		}
		System.out.println(i2 );
	}
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C22.java
C22.java:10: variable i2 might not have been initialized
                System.out.println(i2);
                                   ^
1 error

*/