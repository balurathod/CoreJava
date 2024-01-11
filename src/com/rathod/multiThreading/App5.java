package com.rathod.multiThreading;

class ThreadA extends Thread{

	public ThreadA(String name){
		super(name);	
	start();	
	}
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("thead = "+Thread.currentThread().getName() + " count =" +i);
		}
	}
}

public class App5 {
	public static void main(String[] args) throws Exception {
		
	
	ThreadA threada=new ThreadA("A");
	threada.join();
	ThreadA threadb=new ThreadA("B");
	threadb.join();
	ThreadA threadc=new ThreadA("C");
	threadc.join();
	
	
	System.out.println("main method end");
	}
}
