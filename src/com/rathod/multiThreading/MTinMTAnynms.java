package com.rathod.multiThreading;
//multitasking in multithreading using Anonymous class or Anonymous class that implements Runnable interface.
public class MTinMTAnynms {
	 public static void main(String args[]){  
		  //Thread t1=new Thread(){  //Anonymous class 1
		  Runnable r1=new Runnable(){//annonymous class that implements Runnable interface 
		    public void run(){  
		      System.out.println("task one");  
		    }  
		  };  
		  //Thread t2=new Thread(){  //Anonymous class 2
		  Runnable r2=new Runnable(){//annonymous class that implements Runnable interface
		    public void run(){  
		      System.out.println("task two");  
		    }  
		  }; 
		
	  Thread t1=new Thread(r1);  
	  Thread t2=new Thread(r2);  
	  
	  t1.start();  
	  t2.start();  
	 }  
}  