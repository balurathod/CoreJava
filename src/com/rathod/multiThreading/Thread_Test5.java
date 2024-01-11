//overriding start() method
package com.rathod.multiThreading;
class MyThread5 extends Thread
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
		MyThread5  t = new MyThread5();
		t.start();  //creating new stack for child thread to execute seprtly
		System.out.println("main method");
	}
}