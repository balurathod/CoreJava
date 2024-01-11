package com.rathod.oops;
class NameThread 
{
	public static void main(String[] args) 
	{
		System.out.println("Thread is "+Thread.currentThread().getName());
	}
}
/*

G:\SCJP\Scjp6\ch9-Threads>java MainThread
Exception in thread "main" java.lang.NoClassDefFoundError: MainThread

G:\SCJP\Scjp6\ch9-Threads>java NameThread //class name...
Thread is main
*/