package com.rathod.multiThreading;
class Producer implements Runnable
{
	Stock s;
	Thread t;
	
	public Producer(Stock s)
	{
		this.s = s;
		t = new Thread(this,"Producer Thread");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
			t.sleep(750);
			}
			catch(InterruptedException ie){}
			s.addStock((int)(Math.random()*100));
		}
	}
	void stop()
	{
		t.stop();
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