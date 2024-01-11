package com.rathod.unsolved;
 class Foo          //why we can't declare super class as a public?
{
    void doStuff(){}
}
class Bar extends Foo
	{
		void doStuff(String s)
		{
		}
	}
class TestBar
{
	public static void main(String []  args)
	{
		Foo f=new Foo();
		Bar b=new Bar();
		f.doStuff();
		b.doStuff();
		b.doStuff("");
	}
}
