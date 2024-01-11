package com.rathod.multiThreading;
public class TestIntrruptingThread extends Thread{  
		public void run(){  
			try{  
				Thread.sleep(1000);  
				System.out.println("task");  
			}catch(InterruptedException e){  
			//throw new RuntimeException("Thread interrupted..."+e);  
			System.out.println("Exception handled "+e);  
			}  
			System.out.println("thread is running...");    	  
		}  
		public static void main(String args[]){  
			TestIntrruptingThread t1=new TestIntrruptingThread();  
			t1.start();  
			//try{  
				t1.interrupt(); //we are propagating it, so it will stop working. 
			//}catch(Exception e){System.out.println("Exception handled "+e);}  
			  
		}  
}  