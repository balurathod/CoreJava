package com.rathod.networking;
class Pool
{
	int prime;
	int num[]; 
	public synchronized void addPrime(int i)
	{
		prime=i;
		System.out.println("Prime Number:"+prime);
		notify();
	}
    
	public synchronized int getPrime()       
	{ 
		int flag=0;
		while(true)
		{
		   	if(num.length==0)
               			{
			                 num[0]=prime;
			}
			else
		{
		
			for(int j=0;j<num.length;j++)
			{
				if(num[j]==prime)
				{
					flag=flag+1; 
				}
			}
		}     

		if(flag<1)
		{ 
			System.out.println("The Prime Number taken Away:"+prime);
			break;
		}
		else
		{
			System.out.println("wait");
			try
			{
				wait();
			}
			catch(InterruptedException ie){}                           
		}
	}
		num[num.length+1]=prime;
		return prime;
}

	public static void main(String args[])
	{
		Pool po=new Pool();
		PrimeGenerator pr =new PrimeGenerator(po);
		TableGenerator  tg = new TableGenerator(po);
		try
		{
			Thread.sleep(5000);
			pr.stop();
			tg.stop();
			pr.t.join();
			tg.t.join();
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
                         

  
               
            