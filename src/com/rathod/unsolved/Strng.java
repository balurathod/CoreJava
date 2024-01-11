package com.rathod.unsolved;
class Test19
{
public String makeinString() 
{
	String s="Fred";
	s=s+"47";
	s=s.subString(2,5);
	s=s.toUpperCase();
	return s.toString();
}
	public static void main(String[] args) 
	{
		Test19 t = new Test19();
		t.makinString(45 , 67);
		
		System.out.println("Hello World!");
	}
}
/*
Ans-3    But how?



D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test19.java
Test19.java:7: cannot find symbol
symbol  : method subString(int,int)
location: class java.lang.String
        s=s.subString(2,5);
           ^
1 error

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac Test19.java

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>java Test19
Hello World!

*/