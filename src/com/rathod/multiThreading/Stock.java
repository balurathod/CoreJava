package com.rathod.multiThreading;
class Stock
{
	int goods=0;
	public synchronized void addStock(int i)
	{
		goods += i ;
		System.out.println("Stock Added : " + i);
		System.out.println("Present Stock : " + goods);
		notify();
	}
	
	public synchronized int getStock(int j)
	{
		while(true)
		{
			if(goods >= j)
			{
				goods -= j;
				System.out.println("Stock Take Away : " + j);
				System.out.println("Present Stock : " + goods);
				break;
			}
			else
			{
				System.out.println("Stock Not Enough..");
				System.out.println("Waiting For Stocks To Come....");
				try
				{
					wait();
				}
				catch(InterruptedException ie){}
			}
		}
		return goods;
	}

	public static void main(String args[])
	{
		Stock s = new Stock();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		try
		{
			Thread.sleep(5000);
			p.stop();
			c.stop();
			p.t.join();
			c.t.join();
			System.out.println("Thread Stopped");
		}
		catch(InterruptedException ie){}
		System.exit(0);
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