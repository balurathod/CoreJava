package com.rathod.multiThreading;


class Runner extends Thread{
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

public class Thread1 {
public static void main(String[] args) {
	Runner runner=new Runner();
	runner.start();
	Runner runner1=new Runner();
	runner1.start();
}
}
