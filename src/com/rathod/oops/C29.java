package com.rathod.oops;
class C29 
{
	public static void main(String ka[]) 
	{
		Thread t=new Thread().currentThread(); //
		       setPriority(-1);  //not related vt Thread class. 

			  //t.setPriority(1);  in this way u can set priority of Thread.
		
		System.out.println("Done");
	}
	public static void setPriority(int q)
		{
	    }
}



/*
priority should be 1 to 10 only of thread. & 


Another type of Thread priority,
       1-LOW_PRIORITY
       5-MIDDLE_PRIORITY
       10-HIGH_PRIORITY

*/