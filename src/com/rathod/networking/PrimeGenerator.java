package com.rathod.networking;
class PrimeGenerator implements Runnable
{
	Pool p;
	Thread t;
	public PrimeGenerator(){}
	public PrimeGenerator(Pool p)
	{
		this.p=p;
		t=new Thread(this,"PrimeGenerator");
		t.start();
	}             

	public int getPrime()
	{  
		int flag=0;
		char flag1='n';
	                  int x=0;
		while(flag1=='n')
		{
			flag=0;
			x=(int) (Math.random()*100); 
			System.out.println("X is : " + x);
			for(int i=2;i<x;i++)
			{
				if(x%i==0)
				{ 
					flag=flag+1;
				}
			}
			if(flag<1)
			{
				flag1='y';
				break;
               			
		                 	}		               
		}
		return x;
	                      
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
			p.addPrime(getPrime()); 
		}
	}
             
	public void stop()
	{
		t.stop();
	}

	public static void main(String args[])
	{
		PrimeGenerator pg = new PrimeGenerator ();
		System.out.println(pg.getPrime());
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
                         

  
               
