package com.rathod.oops;
import java.lang.Exception;
class ThrowsOnMain 
{
	public void add() throws Exception
	{
		System.out.println("IN Add()");
	}
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Hello World!");
	}
}
/*
compl & Run ok....


following ERROR can arise due to nOT importing pkg


G:\SCJP\Query\Solved>javac ThrowsOnMain.java
.\Exception.java:3: illegal start of type
try
^
.\Exception.java:6: illegal start of expression
        throws  an Exception
        ^
.\Exception.java:6: ';' expected
        throws  an Exception
                            ^
.\Exception.java:8: illegal start of type
        catch(SomeException se)
        ^
.\Exception.java:8: ';' expected
        catch(SomeException se)
                              ^
.\Exception.java:11: illegal start of expression
        throws an Exception
        ^
.\Exception.java:11: ';' expected
        throws an Exception
                           ^
.\Exception.java:13: illegal start of type
finally
^
ThrowsOnMain.java:3: cannot access Exception
bad class file: .\Exception.java
file does not contain class Exception
Please remove or make sure it appears in the correct subdirectory of the classpath.
        public static void main(String[] args) throws Exception
                                                      ^

G:\SCJP\Query\Solved>javac ThrowsOnMain.java

G:\SCJP\Query\Solved>java ThrowsOnMain
Hello World!

G:\SCJP\Query\Solved>


*/