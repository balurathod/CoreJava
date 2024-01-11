//getting name of thread using getName().
package com.rathod.multiThreading;
class  NameRunnable implements Runnable
{
	public void run()
	{
		System.out.println("NameRunnable running");
		System.out.println("Run by"+Thread.currentThread().getName());
	}
}
public class NameThread
{
	public static void main(String[] args) 
	{
		NameRunnable nr=new NameRunnable();
		Thread t=new Thread(nr);
		t.setName(" BALU ");
		t.start();
	}
}
/*
FOR...//t.setName(" BALU ");

G:\SCJP\Scjp6\ch9-Threads>javac NameThread.java

G:\SCJP\Scjp6\ch9-Threads>java NameThread
NameRunnable running
Run byThread-0




FOR...t.setName(" BALU ");

G:\SCJP\Scjp6\ch9-Threads>javac NameThread.java

G:\SCJP\Scjp6\ch9-Threads>java NameThread
NameRunnable running
Run by BALU

*/