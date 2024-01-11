package com.rathod.multiThreading;

public class ThreadSimple  extends Thread{  
	 public void run(){  
	    System.out.println("Thread is running");  		    
	 }  
	 public static void main(String args[]){ 
		 
		 ThreadSimple t1=new ThreadSimple();    
		 t1.start();  		   
	 }  
}  

