package com.rathod.oops;
class SynchroMethod 
{
	int x = 100;
	public synchronized void doStuff()
	{
		 x = 10;
		System.out.println(" In  Synchronized  method " + x);

          x++;
		System.out.println(" In  Synchronized  method " + x);
	   
	}
	public void doStuff1()
	{ 
		x = 25;
		System.out.println(" Not in Synchronized method  " + x);
	}

	public synchronized static void main(String[] args) 
	{
		SynchroMethod sm = new SynchroMethod();
		sm.doStuff();
		sm.doStuff1();
		System.out.println("in main val of x is " + sm.x);
	}
}
