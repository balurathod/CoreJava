package com.rathod.multiThreading;

public class App2 {
	
	private int count=0;
	
public static void main(String[] args) {
	App2 app2=new App2();
	app2.doWork();
	
}

public void doWork(){
	Thread thread=new Thread(new Runnable(){

		@Override
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println("thread a"+i);
				count++;
			}
		}
		
		
	});
	
	Thread thread1=new Thread(new Runnable(){

		@Override
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println("thread b"+i);
				count++;
			}
		}
	});
	thread.start();
	thread1.start();
	
	try {
		thread.join();
		thread1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("count :" +count);
}
}
