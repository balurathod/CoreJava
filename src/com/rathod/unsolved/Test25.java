package com.rathod.unsolved;
class Test25
{
	public static void main(String[] args) 
	{
		char c='\u0042';   //Study UNICODE in details?
		switch(c)
		{
			default:
             System.out.println("Default");
		case 'A':
			System.out.println("A");
		case 'B':
			System.out.println("B");
		case 'C':
			System.out.println("C");

		}
	}	
}


/* B C

if we remooved 0 from "char c='\u042'"     then 


D:\SCJP\Oldscjp(1-5)\Exam2>javac Test25.java
Test25.java:5: illegal unicode escape
                char c='\u042';
                             ^
Test25.java:5: empty character literal
                char c='\u042';
                       ^
Test25.java:5: ';' expected
                char c='\u042';
                               ^
Test25.java:6: not a statement
                switch(c)
                      ^
Test25.java:6: ';' expected
                switch(c)
                         ^
Test25.java:8: orphaned default
                        default:
                        ^
6 errors

*/