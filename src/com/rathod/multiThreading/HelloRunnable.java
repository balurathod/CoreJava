package com.rathod.multiThreading;

public class HelloRunnable implements Runnable {
			
    public void run() {
        System.out.println("Hello from a thread!");
    }
    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }
}

/*
 * 
 * An application that creates an instance of Thread must provide the code that will run in that thread. There are two ways to do this: 
•	Provide a Runnable object. The Runnable interface defines a single method, run, meant to contain the code executed in the thread. 
	The Runnable object is passed to the Thread constructor, as in the HelloRunnable example: 
•	Subclass Thread. The Thread class itself implements Runnable, though its run method does nothing.
 */