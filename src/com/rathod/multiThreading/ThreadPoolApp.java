package com.rathod.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {
	private int id;

	public Processor(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting ...." + id);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed!!!!!!!!!"+id);
	}

}

public class ThreadPoolApp {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10000; i++) {
			service.submit(new Processor(i));
		}
		service.shutdown();
		System.out.println("All task submitted....");
		
		try {
			boolean b=service.awaitTermination(1, TimeUnit.SECONDS);
			System.out.println("b::"+b);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All task Completed....");
	}
}
