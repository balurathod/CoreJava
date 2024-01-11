package com.rathod.multiThreading;
public class TestIntrptBhvNormly extends Thread{ 		  
	public void run(){  
		for(int i=1;i<=5;i++)  
		System.out.println(i);  
	} 		  
	public static void main(String args[]){  
		TestIntrptBhvNormly t1=new TestIntrptBhvNormly();  
		t1.start();  
		t1.interrupt();
		System.out.println("Hello");  //bcz main is also a thread ,its run first
	}  
}  