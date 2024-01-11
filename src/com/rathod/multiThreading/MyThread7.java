package com.rathod.multiThreading;
class MyThread7 extends Thread//implements Runnable 
{
	public void run()         //to define a THREAD u need a palce to ur run().
	                          //& extend d class THREAD or implmntg RUNNABLE.  
	{
         System.out.println("Imp job running in MyThread");
	}
	public static void main(String[] args) 
	{
		//MyThread mt=new Thread();   //error=incompatible type error  how?
		Thread mt=new MyThread7();     //run vt o/p. but clear d concept of this st. 
		//Thread mt=new Thread();     //compile but no o/p   why?
		System.out.println("Hello World! Welcome for THREAD.");
		mt.run();
	}
}
/*
--poor designing of (code)thread.  why?
--what is diff of user define run() & thread define run()?
--what is d role of thread here?how it's flow? 
--u r free to overload d run() in ur Thread subclass.
--strictly....Thread class expects run() vt no arg.
*/