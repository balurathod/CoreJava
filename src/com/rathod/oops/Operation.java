package com.rathod.oops;

public class Operation {
	 int data=50;  
	  
	 void change(int data){  
	 //void change(Operation op){  	 
	 data=data+100;			//changes will be in the local variable only  
	 //op.data=op.data+100;//changes will be in the instance variable 
	 } 	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500); 
	   //op.change(op); 
	   System.out.println("after change "+op.data);  
	  
	 }  
}  