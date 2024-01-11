package com.rathod.multiThreading;
public class ThreadTest1 extends Thread 
{
	public void run()
	{
		System.out.println("In Run..");
		
		suspend();  //activated due to THread class extends  but not effective for prog
		resume();   //activated but no effective bcz Thread class obj is not created
        yield();
		setPriority(4);
		 void interrupt();        //  Interrupts this thread. 
		 static boolean interrupted();  //Tests whether the current thread has been interrupted. 		
		System.out.println("Leaving Run");
	}
	public static void main(String[] args) 
	{
		ThreadTest1 tt = new ThreadTest1();
		Thread  t = new Thread(tt);
		t.start();   //Leaving Run
		t.setName("BALU");
		t.currentThread().getName();
		
	//	Thread  t = new Thread(tt);
	//	ThreadTest tt = new ThreadTest();   // not legal
	//	tt.start() ;    In Run

		//(new ThreadTest()).start();
		
	}
}


//o\p ->    In Run           but 2 warrning here why?