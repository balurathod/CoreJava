package com.rathod.oops;

public class TestFinallyBlock {
	  public static void main(String args[]){  
		  try{  
		   int data=25/0;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e){System.out.println(e);}  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  
		} 


/*
 * finally block is always executed
   Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.rathod.TestFinallyBlock.main(TestFinallyBlock.java:6)
 * 
 */