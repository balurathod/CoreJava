package com.rathod.oops;

public class LocalInnerClassLocVar {
		 private int data=30;//instance variable  
		 void display(){  
		  final int value=50;//local variable must be final till jdk 1.7 only  
		  //int value=50;//local variable possible to access non-final, since  jdk 1.8 onwards  
		  class Local{  
		   void msg(){System.out.println(value);}  
		  }  
		  Local l=new Local();  
		  l.msg();  
		 }  
		 public static void main(String args[]){  
			 LocalInnerClassLocVar obj=new LocalInnerClassLocVar();  
			 obj.display();  
		 }  
		}  