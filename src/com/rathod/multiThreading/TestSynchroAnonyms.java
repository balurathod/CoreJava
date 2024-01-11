package com.rathod.multiThreading;
//Program of synchronized method by using annonymous class 
class Tables{  
	 synchronized void printTable(int n){//synchronized method  
		   for(int i=1;i<=5;i++){  
			   System.out.println(n*i);  
			   try{  
				   Thread.sleep(400);  
			   }catch(Exception e){System.out.println(e);}  
		   } 	  
	 }  
}  
  
public class TestSynchroAnonyms{  
	public static void main(String args[]){  
	final Tables obj = new Tables();//only one object 	  
		Thread t1=new Thread(){  
			public void run(){  
			obj.printTable(5);  
		}  
		};  
		Thread t2=new Thread(){  
			public void run(){  
			obj.printTable(100);  
			}  
		}; 		  
		t1.start();  
		t2.start();  
	}  
}  