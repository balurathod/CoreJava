package com.rathod.oops;
class Foo	                         //legal overloading not understand well....
{
	public void doStuff(int y , String s)
	{
           System.out.println("In Foo");
	}
	public void moreThings(int x)
	{
          System.out.println("In Foo1");
	}
	public void changeSize(int size, String name,float pattern)
	{
             System.out.println("In Foo2");
	}
}
class Bar extends Foo
{

	public  void doStuff(int y, long s) //throws IOException
	{
		System.out.println("In Bar");
	}
	public void changeSize(int size, String name)
	{
        System.out.println("In Bar1");
	}
	public void changeSize(int size, float pattern)
	{
          System.out.println("In Bar2");
	}
	public void changeSize( String name,float pattern) //throws IOException
	{
            System.out.println("In Bar3");
	}
}
class ovrlodTest
{
	public static void main(String[] args)
	{
          //Foo f=new Foo();
		  Bar b=new Bar();
		  b.doStuff(5,9);
		  b.changeSize(8,5);
		System.out.println("in main");
	}
};