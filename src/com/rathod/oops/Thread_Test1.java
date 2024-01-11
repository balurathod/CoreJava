package com.rathod.oops;
class MyThread extends Thread
{
		public void run()   //implmntcn of run() is complsry for new Thread 
	                 //starting but in this prog obj of Thread class is not created 
	    {           //so this metd is user define not related vt Thread class.
			for(int  i = 0; i<10; i++)
				{
					System.out.println(" child thread is in Main ");
				}
		}
}

class Thread_Test1
{
	public static void main(String  args[])
	{
		MyThread  t = new MyThread();
		for(int i = 0; i<10; i++)
		{
			System.out.println("Execution of each child thrd  always starts & end in main thread");
		}
		
		t.start();     //activated this child due to Threads class extnds


	//	boolean stop = false; in run() for stop thread 
 	//	stop = true; before return st.wen return thrd autmtcl  stop
	}
}