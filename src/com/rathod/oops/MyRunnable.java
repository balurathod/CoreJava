package com.rathod.oops;
class MyRunnable implements Runnable 
{
	public void run()         //to define a THREAD u need a palce to ur run().
	                          //& extend d class THREAD or implmntg RUNNABLE.  
	{
         System.out.println(" its implmntcn imp for  ,Imp job running in MyRunnable");
	}
	public static void main(String[] args) 
	{
		//MyThread mt=new Thread();   //supr type -MyThread class is not supr class of Thread class

       //MyRunnable t=new Thread();   //error=incompatible type error bcz MyRunnable is an intrfc implmntd by Runnable intrfc not extnd by Thread 

		MyThread mt=new MyThread();
		Thread mt1 = (Thread)mt;     //class casting
	    
				
		MyRunnable mr=new MyRunnable();     
		Thread t=new Thread(mr);      //ref casting
		
		Thread f=new Thread();
		
		//Thread g=new Thread(mr);
		//Thread j=new Thread(mr);
        //possible bcoz..u can pass single Runnable instance(mr) to multiple Thread obj
		//(t,f,g,j).so same Runnable becums target to multi threads.  
		
		//Thread t=new MyRunnable();  //compability error why? bcz IS-A test fail
        
		
		Runnable r=new MyRunnable();

		System.out.println("Hello World! Welcome for THREAD.");
		
		r.run();
		t.run();

		f.start();  //start means not running (just next STACK is created)
		mt1.run();
	//	j.run();
	}
}
