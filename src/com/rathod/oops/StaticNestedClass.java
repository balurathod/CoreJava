//
package com.rathod.oops;
public class StaticNestedClass {
		  static int data=30;  
		  static class Inner{  
		   //void msg(){System.out.println("data is "+data);} 
//If you have the static member inside static nested class, you don't need to create instance of static nested class.
		   static void msg(){System.out.println("data is "+data);}  

		  }  
		  public static void main(String args[]){  
			  //StaticNestedClass.Inner obj=new StaticNestedClass.Inner(); 
			  //obj.msg();  
			  StaticNestedClass.Inner.msg();

		  }  
		}  

/*
 *It can access static data members of outer class including private.  
  Static nested class cannot access non-static (instance) data member or method.
  you need to create the instance of static nested class because it has instance method msg(). But you don't need to create the object of Outer class because nested class is static and static properties, methods or classes can be accessed without object.
 
 *
 *
 */