package com.rathod.networking;
class TableGenerator implements Runnable
{
	Pool g;
	Thread t;

	public TableGenerator(Pool g)
	{
		this.g=g;
		t=new Thread(this,"Tablegenerator");
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
		catch(InterruptedException e) {}
		int pm=g.getPrime();
		generateTable(pm);
	}
}  

	public void generateTable(int y)
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println(y+"*"+j+"="+y*j+"\n");
		}
	}

	public void stop()
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