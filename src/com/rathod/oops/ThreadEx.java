package com.rathod.oops;

import java.util.Date;


class ThreadTest extends Thread{
	ThreadTest(){
		/*Thread t=new Thread();
		t.*/start();
	}
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("thread went to sleep");
			try {
				Date date=new Date();
				System.out.println(date.toString());
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx {
public static void main(String[] args) {
	ThreadTest a1=new ThreadTest();

}
}
