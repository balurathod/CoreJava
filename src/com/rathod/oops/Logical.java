package com.rathod.oops;
class Logical 
{
	public static void main(String[] args) 
	{
		boolean b=true && false;
		System.out.println("Boolean b= " + b);
		System.out.format("Pi is approximately %d.", Math.PI);
	}
}
/*

G:\SCJP\Query\LOGIC>javac Logical.java

G:\SCJP\Query\LOGIC>java Logical
Boolean b= false
Pi is approximately Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
        at java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:3992)
        at java.util.Formatter$FormatSpecifier.printInteger(Formatter.java:2708)
        at java.util.Formatter$FormatSpecifier.print(Formatter.java:2660)
        at java.util.Formatter.format(Formatter.java:2432)
        at java.io.PrintStream.format(PrintStream.java:920)
        at Logical.main(Logical.java:7)

G:\SCJP\Query\LOGIC>







*/