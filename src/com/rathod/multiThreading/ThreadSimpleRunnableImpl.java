package com.rathod.multiThreading;

public class ThreadSimpleRunnableImpl implements Runnable{  
	 public void run(){  
	    System.out.println("Thread is running");  		    
	 }  
	 public static void main(String args[]){ 
		 
		 ThreadSimple ts=new ThreadSimple();   
		 //Thread t = new Thread(ts);
		 Thread t = new Thread(new ThreadSimple());//passing anonymous object of ThreadSimple class
		 t.start();  		   
	 }  
}
