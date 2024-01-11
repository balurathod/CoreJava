package com.rathod.multiThreading;
	class Tablss{  		  
		 synchronized static void printTable(int n){  
		   for(int i=1;i<=10;i++){  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){}  
		   }  
		 }  
		}  
		  
		class MyThread111 extends Thread{  
		public void run(){  
		Tablss.printTable(1);  
		}  
		}  
		  
		class MyThread222 extends Thread{  
		public void run(){  
		Tablss.printTable(10);  
		}  
		}  
		  
		class MyThread33 extends Thread{  
		public void run(){  
		Tablss.printTable(100);  
		}  
		}  
		   
		class MyThread44 extends Thread{  
		public void run(){  
		Tablss.printTable(1000);  
		}  
		}  
		  
		public class TestStaticSynchrzcn{  
		public static void main(String t[]){  
		MyThread111 t1=new MyThread111();  
		MyThread222 t2=new MyThread222();  
		MyThread33 t3=new MyThread33();  
		MyThread44 t4=new MyThread44();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
		}  
		}  