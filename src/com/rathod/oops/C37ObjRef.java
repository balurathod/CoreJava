package com.rathod.oops;
class C37 
{
	static void m1(Object x)   //Obj type ref(super ref) as a arg
	{
		System.out.println("Object");
	}
	static void m1(String x)
	{
		System.out.println("String");
	}

	public static void main(String[] args) 
	{
		m1(null);
	}
}

/*

here string is subclass, m1() is override here
when null pass mini /submost class methods r executed




All class of java.lang pkg are automatically imported.
The constructor for the math class is private(bcz Math class is Final), so it can
b instaniated PUBLIC modifier can b applied to a class i.e. not a nested class.
(strictly)

*/