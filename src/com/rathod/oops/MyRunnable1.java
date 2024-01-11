package com.rathod.oops;
class MyRunnable1 implements Runnable 
{
	public void run()         //to define a THREAD u need a palce to ur run().
	                          //& extend d class THREAD or implmntg RUNNABLE.  
	{
         System.out.println(" it is user define ,Imp job running in MyRunnable");
	}
	
	public static void main(String[] args) 
	{
		//MyThread mt=new Thread();   //error=incompatible type error  how?
		
		//MyRunnable t=new Thread();   //IS-A test fail
		
		MyRunnable1 mr=new MyRunnable1();     //run singly....also.
		Thread t=new Thread(mr);
		Thread f=new Thread(mr);
		Thread g=new Thread();      //compile but o/p only for 3 objs (t,f,j) bcoz ref(mr) is not provide to g obj.
		Thread j=new Thread(mr);
        
		//possible bcoz..u can pass single Runnable instance(mr) to multiple Thread obj
		//(t,f,g,j).so same Runnable becums target to multi threads.  
		
		//Thread t=new MyRunnable();  //compability error why?
        
		  //Runnable r=new MyRunnable1();

		System.out.println("Hello World! Welcome for THREAD.");
		mr.run();
		t.run();
		f.run();
		g.run();
		j.run();
	}
}
/*

G:\SCJP\Scjp6\ch9-Threads>javac MyRunnable1.java

G:\SCJP\Scjp6\ch9-Threads>java MyRunnable1
Hello World! Welcome for THREAD.
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable

G:\SCJP\Scjp6\ch9-Threads>javac MyRunnable1.java

G:\SCJP\Scjp6\ch9-Threads>java MyRunnable1
Hello World! Welcome for THREAD.
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable

G:\SCJP\Scjp6\ch9-Threads>javac MyRunnable1.java

G:\SCJP\Scjp6\ch9-Threads>java MyRunnable1
Hello World! Welcome for THREAD.
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable

G:\SCJP\Scjp6\ch9-Threads>javac MyRunnable1.java

G:\SCJP\Scjp6\ch9-Threads>java MyRunnable1
Hello World! Welcome for THREAD.
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable
 it is user define ,Imp job running in MyRunnable

G:\SCJP\Scjp6\ch9-Threads>
*/