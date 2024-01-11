package com.rathod.oops;
class Synchro 
{
	int x = 10;
	public void doStuff()
	{
		 //x = 10;
		System.out.println(" Before  Synchronized  " + x);
	   
		synchronized (this)
		{
			 x = 20 ;  //in this block val of x is fixed i.e. can't alter it.
			System.out.println(" Synchronized  " + x);
		}
            x = 45;
    		System.out.println("  After Synchronized  " + x);

	}
	public void doStuff1()
	{ 
		x = 25;
		System.out.println(" Not Synchronized  " + x);
	}

	public static void main(String[] args) 
	{
		Synchro s = new Synchro();
		s.doStuff();
		s.doStuff1();
		System.out.println("in main val of x is " + s.x);
	}
}
