package com.rathod.oops;
class C 
{
	public static void main(String[] args) 
	{
		int[]a1[]=new int[3][3];//3
		int a2[4]={3,4,5,6};//4   no val should b specified in rt side brackets wen construction an arrary.
		int a2[5];//5
		//System.out.println("Hello World!");
	}
}
/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac  C.java
C.java:6: ']' expected
                int a2[4]={3,4,5,6};//4
                       ^
C.java:6: illegal start of expression
                int a2[4]={3,4,5,6};//4
                        ^
C.java:6: illegal start of expression
                int a2[4]={3,4,5,6};//4
                          ^
C.java:6: not a statement
                int a2[4]={3,4,5,6};//4
                           ^
C.java:6: ';' expected
                int a2[4]={3,4,5,6};//4
                            ^
C.java:7: ']' expected
                int a2[5];//5
                       ^
C.java:7: illegal start of type
                int a2[5];//5
                        ^
C.java:7: <identifier> expected
                int a2[5];//5
                         ^
C.java:7: ';' expected
                int a2[5];//5
                          ^
9 errors
*/