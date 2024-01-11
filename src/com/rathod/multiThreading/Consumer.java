package com.rathod.multiThreading;
class Consumer implements Runnable
{
	Stock c;
	Thread t;

	public Consumer(Stock c)
	{
		this.c = c;
		t = new Thread(this,"Consumer Thread");
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
			c.getStock((int)(Math.random()*100));
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