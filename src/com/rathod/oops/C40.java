package com.rathod.oops;
class C40 
{
	public static void main(String[] args) 
	{
		double d1=Math.floor(0.5);         //count int val mini fractional(o.o)
		double d2=Math.floor(1.5);          //count int val mini fractional(1.o)
		System.out.println(d1+","+d2);
		System.out.println("String".substring(0,4));

		if("String".replace('t','T')=="String".replace('t','T'))
			System.out.println("Equal");
	    else 
			System.out.println("NotEqual");       //how?

	}
}
/*
== check for references are equal or !
equal() check values are equal

STring r both same but ref is diff.
o.o,1.o
stri
Not Equal

*/