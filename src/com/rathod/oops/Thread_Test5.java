package com.rathod.oops;
//overriding start() method

class MyThread extends Thread
{
	public void start()
	{
		super.start(); //start() of Thread class
		System.out.println("start method");
	}
}

class Thread_Test5
{
	public static void main(String  args[])
	{
		MyThread  t = new MyThread();
		t.start();  //creating new stack for child thread to execute seprtly
		System.out.println("main method");
	}
}