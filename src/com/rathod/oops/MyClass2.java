package com.rathod.oops;
//5	What will happen if you try to compile and run the following code  ?
public class MyClass { 
         public static void main (String arguments[])  { 
                   amethod( arguments) ; 
         } 
         public void amethod (String[] arguments)  { 
                   System.out.println (arguments) ; 
                   System.out.println (arguments[1]) ; 
        } 
} 
/*
 	A	Error Can't make static reference to void amethod. 
B	Error Incorrect main method.
C	amethod must be declared with String
D	Compiles and executes fine.
 	 
 
 

 A
 
 
We cannot call a non static method from a static context.   	 

	
 
 
 
 6	Which of the following will compile without error ?
A	import java.util.*; 
package mypack; 
class MyClass {} 

B	package mypack; 
import java.uril.*; 
class MyClass{} 
C	 //This is a comment  
package MyPackage; 
import java.awt.*; 
class MyClass{} 
D	All of the above
 	 
 
 

 B and C
 
 
The order of different statements and blocks in a java program is as follows. package declaration first, then imports, then class declaration. So if a package declaration exist, it =must be the first non comment code in the file.	 

	
 

 
 //7
Float f= new Float( 1.0F );
String str = "value is " +f;
System.out.println( str );
/*
What will be the output of executing the above code snippet?
 	A	Compiler error invalid character in constructor
B	Runtime exception invalid character in constructor.
C	Compiles and prints 'value is 1.0'
D	Compiles and prints 'value is 1'
 	 
 
 

 C
 
 
Choice A and B is incorrect because we can use 'F' to specify the given number is float. 	 

	
 


 8	Which of the following are java keywords  ?
 	A	null
B	const
C	volatile
D	true
 	 
 
 

 B and C
 
 
Choices B and C are java keywords. Choice A and D are not java keywords,
but they are treated as reserved words in java.	 

	
 

 
 







*/


 
 



