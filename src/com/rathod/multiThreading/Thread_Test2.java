package com.rathod.multiThreading;
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("no arg method");
		run(10); //just passing para val
	}
		public void run(int i)
		{
			System.out.println("int args method");
		}
}

class Thread_Test2
{
	public static void main(String  args[])
	{
		MyThread2  t = new MyThread2();
		t.start();//creating new stack for child thread to execute seprtly
		System.out.println("in main method");
	}
}