package com.rathod.JavaFeaturesVersionwise.java8;

	// Java program to demonstrate working of lambda expressions 
public class LambdaExprWithTwoArgs {
	{ 
	    // operation is implemented using lambda expressions 
	    interface FuncInter1 
	    { 
	        int operation(int a, int b); 
	    } 
	  
	    // sayMessage() is implemented using lambda expressions above 
	    interface FuncInter2 
	    { 
	        void sayMessage(String message); 
	    } 
	  
	    // Performs FuncInter1's operation on 'a' and 'b' 
	    private int operate(int a, int b, FuncInter1 fobj) 
	    { 
	        return fobj.operation(a, b); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        // lambda expression for addition for two parameters 
	        // data type for x and y is optional. 
	        // This expression implements 'FuncInter1' interface 
	        FuncInter1 add = (int x, int y) -> x + y; 
	  
	        // lambda expression multiplication for two parameters 
	        // This expression also implements 'FuncInter1' interface 
	        FuncInter1 multiply = (int x, int y) -> x * y; 
	  
	        // Creating an object of Test to call operate using 
	        // different implementations using lambda Expressions 
	        Test tobj = new Test(); 
	  
	        // Add two numbers using lambda expression 
	        System.out.println("Addition is " + 
	                          tobj.operate(6, 3, add)); 
	  
	        // Multiply two numbers using lambda expression 
	        System.out.println("Multiplication is " + 
	                          tobj.operate(6, 3, multiply)); 
	  
	        // lambda expression for single parameter 
	        // This expression implements 'FuncInter2' interface 
	        FuncInter2 fobj = message ->System.out.println("Hello " + message); 
	        fobj.sayMessage("Geek"); 
	    } 
	}
	
/*	
	Output:

	Addition is 9
	Multiplication is 18
	Hello Geek
	Important points:

	The body of a lambda expression can contain zero, one or more statements.
	When there is a single statement curly brackets are not mandatory and the return type of the anonymous function is the same as that of the body expression.
	When there are more than one statements, then these must be enclosed in curly brackets (a code block) and the return type of the anonymous function is the same as the type of the value returned within the code block, or void if nothing is returned.
*/