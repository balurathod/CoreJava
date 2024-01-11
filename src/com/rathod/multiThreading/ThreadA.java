package com.rathod.multiThreading;
class ThreadA 
{
	public static void main(String[] args) 
	{
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) //this has lock on b  
		{//wait(),notify(), & noptifyAll() must b define in this block only. 
			try
			{
		       System.out.println("Waiting for b to compile.... ");
			   b.wait();
			}
			catch (InterruptedException e){	}
			System.out.println(" Total is : " + b.total);
		}
	}
}
class ThreadB extends Thread
{
	int total ;
	public void run()
	{
		synchronized(this)
		{
			for (int i = 0; i < 100 ; i++ )
			{
				total += i;
				//System.out.println("Total waiting THREADS " + total);
			}
			notify();
		}
	}
}
/*

This prog contn two obj of ThreadB's - b & Thread's 1 vt threads 



G:\SCJP\Query\Solved>javac ThreadA.java

G:\SCJP\Query\Solved>java ThreadA
Waiting for b to compile....
Total is : 4950

G:\SCJP\Query\Solved>

*/