package com.rathod.multiThreading;

public class RunnableTest {
	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
		  public void run() {
		    try {
		      while (true) {
		        System.out.println("Hello, world!");
		        Thread.sleep(1000L);//1 sec
		      }
		    } catch (InterruptedException iex) {}
		  }
		};
		Runnable r2 = new Runnable() {
		  public void run() {
		    try {
		      while (true) {
		        System.out.println("Goodbye, " +"cruel world!");
		        Thread.sleep(2000L);//2 sec
		      }
		    } catch (InterruptedException iex) {}
		  }
		};
		
		Thread thr1 = new Thread(r1);
		Thread thr2 = new Thread(r2);
		thr1.start();
		thr2.start();
	}
}
