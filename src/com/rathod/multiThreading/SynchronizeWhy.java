package com.rathod.multiThreading;

public class SynchronizeWhy {
	
	// private volatile int count = 0;
	private int count = 0;
	
	// synchronized acquire a lock on t1, t2 will be waiting state. t1 execution done release lock 
	// and t2 will of execution. without synchronized o/p will be sometime correct 
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		SynchronizeWhy sw = new SynchronizeWhy();
		sw.doWork();
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("count is "+count);

	}
	
}
