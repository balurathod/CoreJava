package com.rathod.oops;
//overriding start() method

class MyThread extends Thread
{
	//implmntcn of run() is compulsary only for activating new/child Threads
	public void start(int i)  
	{
		System.out.println("start method");
	}
}

class Thread_Test4
{
	public static void main(String  args[])
	{
		MyThread  t = new MyThread();
		t.start(); //creating new stack for child thread to execute seprtly
		System.out.println("main method");
	}
}