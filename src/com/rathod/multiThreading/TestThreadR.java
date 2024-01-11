//Now Actual THREAD r running.
package com.rathod.multiThreading;

class   FooRunnables implements Runnable 
{
	public void run()
	{
		for (int i=0;i<6 ;i++ )
		{
			System.out.println("Runnable is running");
		}
	}
}

 class TestThreadR
{
	public static void main(String[] args) 
	{
		FooRunnables r=new FooRunnables();
		Thread t=new Thread(r);
		//Thread t1=new Thread(r);
		System.out.println("Hello Thread ");
		t.start();
		//t1.start();
	}
}
