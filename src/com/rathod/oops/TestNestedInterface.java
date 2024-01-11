package com.rathod.oops;

public class TestNestedInterface implements A.Message//Showable.Message
	{  
		 public void msg(){System.out.println("Hello nested interface");}  
		  
		 public static void main(String args[]){  
		  //Showable.Message message=new TestNestedInterface();//upcasting here using interface 
		  A.Message message=new TestNestedInterface();//upcasting here using class 
		  message.msg();  
		 }  
		}  