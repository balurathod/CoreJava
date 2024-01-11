package com.rathod.oops;
class Test10 
{
	public static void main(String[] args) 
	{
		boolean assert = true;
		if (assert)
		{
			System.out.println("assert is true");
		}
		
	}
}
/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac -source 1.3 Test10.java
Test10.java:5: warning: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
(use -source 1.4 or higher to use 'assert' as a keyword)
                boolean assert=true;
                        ^
Test10.java:6: warning: as of release 1.4, 'assert' is a keyword, and may not be used as an identifier
(use -source 1.4 or higher to use 'assert' as a keyword)
                if (assert)
                    ^
2 warnings

*/