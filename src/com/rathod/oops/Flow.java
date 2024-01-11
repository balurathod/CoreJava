package com.rathod.oops;
class C21
{
	final int i1;
	// int i1;    o/p--> 3
	
	C21()
	{
		i1=i1+1;//scope of  var i1 is alive till end of main bcz it is instnc var
	}
	
	{
		i1=2;
	}

	public static void main(String[] args) 
	{
		C21 obj=new C21();
		System.out.println(obj.i1);
	}
}

/*
Flow of execution BLOCK is static ->initialized ->constor accrdng to IS-A flow

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C21.java
C21.java:7: variable i1 might already have been assigned
                i1=i1+1;
                ^
1 error

*/