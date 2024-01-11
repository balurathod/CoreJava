package com.rathod.multiThreading;
class CreateThread  implements Runnable
{
	String tname;
	Thread t;
	public CreateThread(String s)
	{
		tname=s;
		t = new Thread(this,s);
		System.out.println("New Thraed : " + t);
		t.start();
	}

	public void run()
	{
		try
		{
			for(int i = 5 ; i > 0 ; i--)
			{
				System.out.println(tname + "  : " + t);
				Thread.sleep(500);
			}
		}

		catch(InterruptedException e){}
		System.out.println(tname + " exiting ....");
	}
}

class ThreadMethod2
{
	public static void main(String args[])
	{
		CreateThread m1 = new CreateThread("One");
		CreateThread m2 = new CreateThread("Two");
		System.out.println("Thread m1 is alive : " + m1.t.isAlive());
		System.out.println("Thread m2 is alive : " + m2.t.isAlive());
		try
		{
			System.out.println("Waiting for threads to finish....");
			m1.t.join();
			m2.t.join();
		}
		catch(InterruptedException ie){}
		System.out.println("Thread m1 is alive : " + m1.t.isAlive());
		System.out.println("Thread m2 is alive : " + m2.t.isAlive());
		System.out.println("Main Thread Exiting....");
	}
}

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/
