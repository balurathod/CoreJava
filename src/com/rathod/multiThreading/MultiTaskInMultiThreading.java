package com.rathod.multiThreading;
//multitasking in multithreading
class MultiTaskInMultiThreading1 extends Thread{  
		 public void run(){  
		    System.out.println("Task 2 is running");  		    
		 }  
	}
public class MultiTaskInMultiThreading extends Thread{  
	 public void run(){  
	    System.out.println("Task 1 is running");  		    
	 }  
	 public static void main(String args[]){ 		 
		 MultiTaskInMultiThreading t1 = new MultiTaskInMultiThreading(); 
		 MultiTaskInMultiThreading1 t2 = new MultiTaskInMultiThreading1();
		 t1.start(); 
		 t2.start(); 
	 }  
}  

