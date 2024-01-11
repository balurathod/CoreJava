package com.rathod.multiThreading;

public class TestIsIntrptd extends Thread{  
		  
		public void run(){  
		for(int i=1;i<=2;i++){  
		if(Thread.interrupted()){  
		System.out.println("code for interrupted thread");  
		}  
		else{  
		System.out.println("code for normal thread");  
		}  
		  
		}//end of for loop  
		}  
		  
		public static void main(String args[]){  
		  
			TestIsIntrptd t1=new TestIsIntrptd();  
			TestIsIntrptd t2=new TestIsIntrptd();  
		  
		t1.start();  
		t1.interrupt();  
		  
		t2.start();  
		  
		}  
		}  