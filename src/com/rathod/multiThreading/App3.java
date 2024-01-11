package com.rathod.multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Processor implements Runnable{
	private int id;
	
	public Processor(int id){
		this.id=id;
	}
	
	public void run(){
		System.out.println("Starting thread with id "+id );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completing thread with id "+id );
	}

}



public class App3 {
public static void main(String[] args) {
	ExecutorService service=Executors.newFixedThreadPool(1);
	for(int i=0;i<2; i++){
		service.submit(new Processor(i));
	}
	service.shutdown();
	System.out.println("All task Completed");
	try {
		System.out.println("----------------");
		service.awaitTermination(1,TimeUnit.SECONDS);
		System.out.println("................");
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
