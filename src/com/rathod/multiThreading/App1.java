package com.rathod.multiThreading;

public class App1 {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable(){

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
		});
		
		t.start();
	}

}
