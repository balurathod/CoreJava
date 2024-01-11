package com.rathod.oops;
//Simple GC eg.
public class TestGC {
	 public void finalize(){System.out.println("object is garbage collected");}  
	 public static void main(String args[]){  
		  TestGC s1=new TestGC();  
		  TestGC s2=new TestGC();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
	 }  
}  