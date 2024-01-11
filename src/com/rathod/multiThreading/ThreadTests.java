package com.rathod.multiThreading;
public class ThreadTests extends Thread 
	{
	public void run()
	{
		System.out.println("In run");
		suspend();  // use to suspend execution here of this fun.
		resume();     //to b continue of execution.
		System.out.println("Leaving run");
	}	
	public static void main(String args [])
		{
	       (new ThreadTests()).start();
	    }
}
/*
   STOP RESUME SUSPENDS  r Deprecated.
   
    This method has been deprecated, as it is inherently deadlock-prone.
	If the target thread holds a lock on the monitor protecting a critical system 
	resource when it is suspended, no thread can access this resource until the 
	target thread is resumed. If the thread that would resume the target thread 
	attempts to lock this monitor prior to calling resume, deadlock results. Such 
	deadlocks typically manifest themselves as "frozen" processes. For more 
	information, 
	
	
	
	Why are Thread.stop, Thread.suspend and Thread.resume 
	Deprecated?.



	Why is Thread.stop deprecated?

Because it is inherently unsafe. Stopping a thread causes it to unlock all the 
monitors that it has locked. (The monitors are unlocked as the ThreadDeath 
exception propagates up the stack.) If any of the objects previously protected by
these monitors were in an inconsistent state, other threads may now view these 
objects in an inconsistent state. Such objects are said to be damaged. When 
threads operate on damaged objects, arbitrary behavior can result. This behavior
may be subtle and difficult to detect, or it may be pronounced. Unlike other 
unchecked exceptions, ThreadDeath kills threads silently; thus, the user has no 
warning that his program may be corrupted. The corruption can manifest itself at 
any time after the actual damage occurs, even hours or days in the future.



Why are Thread.suspend and Thread.resume deprecated?

Thread.suspend is inherently deadlock-prone. If the target thread holds a lock on 
the monitor protecting a critical system resource when it is suspended, no thread 
can access this resource until the target thread is resumed. If the thread that 
would resume the target thread attempts to lock this monitor prior to calling 
resume, deadlock results. Such deadlocks typically manifest themselves as "frozen"
processes.



*/