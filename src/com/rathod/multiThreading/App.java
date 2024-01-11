package com.rathod.multiThreading;

class Thead2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(" Hello "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}



public class App {
public static void main(String[] args) {
	Thread t1=new Thread(new Thead2());
	Thread t2=new Thread(new Thead2());
	t1.start();
	t2.start();
}
}
