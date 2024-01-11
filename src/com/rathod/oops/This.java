package com.rathod.oops;
class This 
{
//	System.out.println(this);//illegal start & identifier expected.
	public static void main(String[] args) 
	{
		System.out.println(this);
	}
}
/*

G:\SCJP\Query\Solved>javac This.java
This.java:5: non-static variable this cannot be referenced from a static context
                System.out.println(this);
                                   ^
1 error

*/