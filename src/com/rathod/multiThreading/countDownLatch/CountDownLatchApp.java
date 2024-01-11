package com.rathod.multiThreading.countDownLatch;
import java.util.concurrent.*;

class Processor1 implements Runnable{
	private java.util.concurrent.CountDownLatch latch;
	public Processor1(java.util.concurrent.CountDownLatch latch){
		this.latch=latch;
		
	}
	
	public void run() {
		System.out.println("All started.....");
		try {
			Thread.sleep(1000);
			System.out.println("latch.getCount():: inside therad run"+latch.getCount());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		latch.countDown();
	
	}
	
}
 

public class CountDownLatchApp {
public static void main(String[] args) {
	java.util.concurrent.CountDownLatch latch=new java.util.concurrent.CountDownLatch(4);
	ExecutorService service=Executors.newFixedThreadPool(4);
	for (int i = 0; i < 5; i++) {
		service.submit(new Processor1(latch));
		
	}
	try {
		System.out.println("latch.inside try ::"+latch.getCount());
		latch.await();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("latch.getCount() at end ::"+latch.getCount());
	System.out.println("Completed...");
}
}
