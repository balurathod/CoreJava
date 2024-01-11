//Now Actual THREAD r running.
package com.rathod.multiThreading;
class FooIRunnable implements Runnable 
{
	public void run()
	{
		for (int i=0;i<6 ;i++ )
		{
			System.out.println("Runnable is running");
		}
	}
}

public class TestThreads
{
	public static void main(String[] args) 
	{
		FooIRunnable r=new FooIRunnable();
		Thread t=new Thread(r);
		System.out.println("Hello Thread ");
		t.start();
	}
}
