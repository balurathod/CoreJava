package com.rathod.multiThreading;
class MyRunnable implements Runnable 
{
	public void run()         //to define a THREAD u need a palce to ur run().
	                          //& extend d class THREAD or implmntg RUNNABLE.  
	{
         System.out.println(" it is user define ,Imp job running in MyRunnable");
	}
	public static void main(String[] args) 
	{
		//MyThread mt=new Thread();   //error=incompatible type error  how?
		//MyRunnable t=new Thread();   
		
		MyRunnable mr=new MyRunnable();     //compile but no o/p   why?
		Thread t=new Thread(mr);
		Thread f=new Thread(mr);
		Thread g=new Thread(mr);
		Thread j=new Thread(mr);
        //possible bcoz..u can pass single Runnable instance(mr) to multiple Thread obj
		//(t,f,g,j).so same Runnable becums target to multi threads.  
		
		//Thread t=new MyRunnable();  //compability error why?
        
		  Runnable r=new MyRunnable();

		System.out.println("Hello World! Welcome for THREAD.");
		//mr.run();
		r.run();
		t.run();
		f.run();
		g.run();
		j.run();
	}
}
