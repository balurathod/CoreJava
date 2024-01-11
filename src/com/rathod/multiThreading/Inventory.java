package com.rathod.multiThreading;
class Inventory
{
	static int qoh=500;
	static int req=0;
	static public synchronized void request(int order)
	{
		if(order <= qoh)
		{
			System.out.println("Quantity Ordered : " + order);
			qoh -= order;
			req += order;
			System.out.println("Quantity On Hand " +  qoh);
			System.out.println("Total Quantity Taken Away By Way Of Order: " + req);
		}
		else
		{
			System.out.println("Ordered Quantity More Than Quantity On Hand");
		}
	}

	public static void main(String args[])
	{
		new OurThread();
		new OurThread();
		try
		{
			for(int p = 3 ; p > 0 ; p--)
			{
				System.out.println("======================================");
				System.out.println("Main Thread  : " + p );
				System.out.println("======================================");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie){}
		System.out.println("Exiting Main Thread.....");
	}
}

class OurThread extends Thread
{
	OurThread()
	{
		super("Test Thread");
		System.out.println("Child Thread : " + this);
		start();
	}

	public void run()
	{
	for(int i = 5  ; i > 0 ; i --)
		{	
			try
			{
				sleep(500);
			}
			catch(InterruptedException ie){}
			Inventory.request((int) (Math.random() * 100));
		}
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