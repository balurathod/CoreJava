package com.rathod.multiThreading;

public class ThreadEx extends Thread
	{
	 
	 public void run()
	 {
	  
	  for (int i = 1; i <=5; i++){
	   try {
	    Thread.sleep(500);
	   } catch (Exception e) {
	    // TODO: handle exception
	    e.printStackTrace();
	   }System.out.println(i);
	   
	  }
	 }
		public static void main(String[] args) {  
		 ThreadEx Tt1 = new ThreadEx();
		 ThreadEx Tt2 = new ThreadEx();
		 ThreadEx Tt3 = new ThreadEx();
	  Tt1.start();
	  try {
	   Tt1.join(1500);
	  } catch (Exception e) {
	   // TODO: handle exception
	  }
	  Tt2.start();
	  Tt3.start();
	 } 

	} 


