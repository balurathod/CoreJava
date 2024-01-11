package com.rathod.unsolved;
class MyThread extends Thread 
{
	public void run()
	{
		System.out.println("MyThread : run()");
	}
	public void start()
	{
		System.out.println("MyThread : star()");
	}
	
}
class MyRunnable implements Runnable 
{

   public void run()
	{
		System.out.println("MyRunnable : run()");
	}
	public void start()
	{
		System.out.println("MyRunnable : start()");
	}
}
class MyThreadTest
{
	public static void main(String[] args) 
	{
		MyThread myThread = new MyThread();
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		myThread.start();
		thread.start();

	}
};
/*

How this is?

G:\SCJP\Query\Solved>javac MyThreadTest.java

G:\SCJP\Query\Solved>java MyThreadTest
MyThread : star()
followed by 
MyRunnable : run()

G:\SCJP\Query\Solved>javac MyThreadTest.java
*/