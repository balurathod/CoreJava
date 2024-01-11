package com.rathod.oops;
//63
class Test9 
{
	public static void main(String[] a) 
	{
		assert a.length==1;
		System.out.println("Hello World!");
	}
}
/*java -ea test  & java ea test file1 file2



G:\SCJP\Oldscjp(1-5)\2Spiral\Exam4>javac Test9.java

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam4>java Test9
Hello World!

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam4>java -ea Test9
Exception in thread "main" java.lang.AssertionError
        at Test9.main(Test9.java:6)

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam4>java -da Test9
Hello World!

G:\SCJP\Oldscjp(1-5)\2Spiral\Exam4>javac Test5.java
*/




