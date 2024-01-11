package com.rathod.oops;

class MyThread extends Thread {
	String msg;
	int delay;
	Thread t;
	public MyThread(String msg, int delay, Thread t ) {
		this.msg = msg;
		this.delay = delay;
		this.t = t;
	}
	public void run() {
		System.out.println(t.getName()+" is alive ? "+t.isAlive());
		System.out.println(getName()+" is alive ? "+isAlive());
		for(int i=0;i<10;i++) {
			System.out.print(msg+" ");
			System.out.println(t.getName()+" is alive ? "+t.isAlive());
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
}
public class ThreadTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("begin main");
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" is alive ? "+t.isAlive());
		System.in.read();
		System.out.println("creating 2 threads!!!");
		MyThread t1 = new MyThread("Ping",150,Thread.currentThread());
		MyThread t2 = new MyThread("Pong",150,Thread.currentThread());
				
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	
		System.out.println("end main");
	}
}
