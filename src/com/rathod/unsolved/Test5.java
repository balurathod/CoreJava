package com.rathod.unsolved;
class Test5 
{
	public static void main(String[] args) 
	{
		Integer i=new Integer(1)+Integer(2);
		switch(i)
		{
			case 3: System.out.println("Three");break;
			default: System.out.println("Other");break;
		}

	}
}
/*
o/p-->Three        according to book

but
D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test5.java
Test5.java:5: cannot find symbol
symbol  : method Integer(int)
location: class Test5
                Integer i=new Integer(1)+Integer(2);
                                         ^
Test5.java:5: operator + cannot be applied to java.lang.Integer,Integer
                Integer i=new Integer(1)+Integer(2);
                          ^
2 errors

*/