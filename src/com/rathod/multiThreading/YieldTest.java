package com.rathod.multiThreading;

class MyRunnable2 implements Runnable{
	    public void run(){
	           for(int i=0;i<5;i++){
	                  Thread.yield();
	                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
	           }          
	    }
	}
	 
	class MyRunnable3 implements Runnable{
	    public void run(){
	           for(int i=0;i<5;i++){
	                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
	           }          
	    }
	}
	 
	/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
	public class YieldTest {
	    public static void main(String...args){
	           Thread thread1=new Thread(new MyRunnable2(),"Thread-1");
	           Thread thread2=new Thread(new MyRunnable3(),"Thread-2");
	           thread1.start();
	           thread2.start();
	    }
	}
	 
	/*OUTPUT
	 
	i=0 ,ThreadName=Thread-1
	i=0 ,ThreadName=Thread-2
	i=1 ,ThreadName=Thread-1
	i=1 ,ThreadName=Thread-2
	i=2 ,ThreadName=Thread-1
	i=2 ,ThreadName=Thread-2
	i=3 ,ThreadName=Thread-1
	i=3 ,ThreadName=Thread-2
	i=4 ,ThreadName=Thread-1
	i=4 ,ThreadName=Thread-2
	
	We may even notice that, if program is executed with yield() method even than output of program is same as that of program executed without yield() method.
	*/