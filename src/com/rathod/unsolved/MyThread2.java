package com.rathod.unsolved;
class MyThread2 implements Runnable 
{
	public void run()         //to define a THREAD u need a palce to ur run().
	                          //& extend d class THREAD or implmntg RUNNABLE.  
	{
         System.out.println(" it is user define ,Imp job running in MyRunnable");
	}
	public static void main(String[] args) 
	{
		//MyThread mt=new Thread();   //error=incompatible type error  how?
		
		Runnable r2=new MyThread();     //run vt o/p. but clear d concept of this st. 
		
		//MyThread mt=new Thread();     //compile but no o/p   why?
		
		System.out.println("Hello World! Welcome for THREAD.");
          r2.run();
	}
}
/*

IMP....
there is no any rel bet MyThread class & MyThread2 class here..
so how /on which concept following is possible? 




for    Runnable mt=new MyThread();   not any magic it is running other files  obj of MyThread class.
output is ...

G:\SCJP\Scjp6\ch9-Threads>javac MyThread2.java

G:\SCJP\Scjp6\ch9-Threads>java MyThread2
Hello World! Welcome for THREAD.
Imp job running in MyThread




for    Runnable mt=new MyThread2();
output is ...

G:\SCJP\Scjp6\ch9-Threads>javac MyThread2.java

G:\SCJP\Scjp6\ch9-Threads>java MyThread2
Hello World! Welcome for THREAD.
Imp job running in MyRunnable

*/