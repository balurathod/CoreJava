package com.rathod.unsolved;
class CE extends Thread 
{
	public static void main(String[] args) 
	{
		CE b=new CE();
		b.run();

	}
	public void start()
	{
		for (int i=0;i<10 ;i++ )
		{
		System.out.println("Val of i="+i);
		}
	}
}


//How o/p is nothing here?

//public void run()-signature of run() method of the Runnable Interface.