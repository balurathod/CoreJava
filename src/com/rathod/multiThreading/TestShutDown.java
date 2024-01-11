package com.rathod.multiThreading;

class MyThread extends Thread{  
	    public void run(){  
	        System.out.println("shut down hook task completed..");  
	    }  
	}  	  
public class TestShutDown{  
	public static void main(String[] args)throws Exception {  
	  
		Runtime r=Runtime.getRuntime(); //The method that returns the instance of a class is known as factory method. 
		r.addShutdownHook(new MyThread());  
		      
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{Thread.sleep(3000);}
		catch (Exception e) {}  
	}  
}  