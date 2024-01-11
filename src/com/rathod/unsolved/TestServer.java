package com.rathod.unsolved;
class TestServer 
{
	int count=15;
	public void logIn()
	{
		int count=10;
		System.out.println("count=" + count);
	}
	public void doSomething(int i)
	{
		System.out.println("Heloo i am instance variable\n" + "count=" + count);
	}
	public static void main(String[] args) 
	{
		TestServer ts=new TestServer();
		System.out.println("Hello...I am Local Variable ");
		ts.logIn();
		ts.doSomething(45);        //we provide 45 then it print 15 why? 
	}
}
//if local variable can't access outside a method then how it use in method.
//for calculation only within in method & access that method using class ref.s