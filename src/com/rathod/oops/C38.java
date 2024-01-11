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
//here string is subclass, m1() is override here
//when null pass mini /submost class methods r executed
