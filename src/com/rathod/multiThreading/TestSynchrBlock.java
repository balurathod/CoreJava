package com.rathod.multiThreading;
	class Tabless{ 		  
		 void printTable(int n){  
		   synchronized(this){//synchronized block  
		     for(int i=1;i<=5;i++){  
		      System.out.println(n*i);  
		      try{  
		       Thread.sleep(400);  
		      }catch(Exception e){System.out.println(e);}  
		     }  
		   }  
		 }//end of the method  
		}  
		  
		class MyThread11 extends Thread{  
		Tabless t;  
		MyThread11(Tabless t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(5);  
		}  
		  
		}  
		class MyThread22 extends Thread{  
		Tabless t;  
		MyThread22(Tabless obj){  
		this.t=obj;  
		}  
		public void run(){  
		t.printTable(100);  
		}  
		}  
		  
		public class TestSynchrBlock{  
		public static void main(String args[]){  
		Tabless obj = new Tabless();//only one object  
		MyThread11 t1=new MyThread11(obj);  
		MyThread22 t2=new MyThread22(obj);  
		t1.start();  
		t2.start();  
		}  
		}  