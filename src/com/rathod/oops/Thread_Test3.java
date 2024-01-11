package com.rathod.oops;

class MyThread extends Thread
{
}

class Thread_Test3
{
	public static void main(String  args[])
	{
		MyThread  t = new MyThread();
		t.start();
	}
}