package com.rathod.oops;

public class Testarray4 {
	public static void main(String args[]){  
	  
	int arr[]={4,4,5};  
	  
	Class c=arr.getClass();  
	String name=c.getName();  
	  
	System.out.println(name);  
	  
	}
} 

/*
output : [I   chk how?
          
In java, array is an object. For array object, an proxy class is created 
whose name can be obtained by getClass().getName() method on the object.

*/