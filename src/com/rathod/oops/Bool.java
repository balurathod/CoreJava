package com.rathod.oops;
//<![CDATA [
class C19
{
	public static void main(String[] args) 
	{
		boolean b1;
		b1=3<4<5;                  //1  "<" can't applyied to boolean 

		System.out.println(b1);      //2
	}
}
//]]>

/*

Explaination....
           <![CDATA[3<4<5 evaluate to true <5_> it's a wrong expression 
		    so it result in compile time error.]]>




if ln 1 & 12 remove den compl err-  "<" can't applied to boolean




D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>javac C19.java
C19.java:1: class, interface, or enum expected
<![CDATA [
^
C19.java:12: class, interface, or enum expected
]]>?
^
2 errors
*/