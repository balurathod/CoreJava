package com.rathod.multiThreading;

public class ThreadAllTest extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{Thread.sleep(500);}
	    catch(InterruptedException e){System.out.println(e);}  
	    System.out.println("current "+Thread.currentThread().getName()+" Running-"+i);  
	  }
	  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
	  }  
	  else{  
		  System.out.println("user thread work");  
	 }  
	  //returns the reference of currently running thread.
	  System.out.println("currentThread "+Thread.currentThread().getName()); 
	  System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  

	 }  
	 public static void main(String args[]){  
	 ThreadAllTest t1=new ThreadAllTest();  
	 ThreadAllTest t2=new ThreadAllTest();  
	 ThreadAllTest t3=new ThreadAllTest(); 
	 
	 t1.setDaemon(true);//now t1 is daemon thread 
	 t1.setPriority(Thread.MIN_PRIORITY); //1 
	 t2.setPriority(Thread.MAX_PRIORITY); //10
	 t3.setPriority(Thread.NORM_PRIORITY);//5
	 
	 System.out.println("Name of t1:"+t1.getName());  
	 System.out.println("Name of t2:"+t2.getName());  
	 System.out.println("id of t1:"+t1.getId());  
	 
	  t1.start();  
	  //t1.setDaemon(true);//will throw exception here bcz If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException. 
	  //t1.start();  // if start a thread twice -->java.lang.IllegalThreadStateException
	  //t1.run();    //fine, but does not start a separate call stack ,treated as normal object not thread object.
	  try{  
		  //t1.join();  
		  t1.join(1500);//when t1 is completes its task for 1500 milliseconds(3 times) then t2 starts executing.
		 }catch(Exception e){System.out.println(e);}  
	  
	  t2.start();  //by join mtd when t1 completes its task then t2 starts executing.
	  t3.start();
	  
	  t1.setName("Balu Rathod");  //used to return the name of a thread.
	  System.out.println("After changing name of t1:"+t1.getName());  //used to return the name of a thread.
	 }  
}  

