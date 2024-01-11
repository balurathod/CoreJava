package com.rathod.oops;
//16	What will be the result of attempting to compile and run the following code  ?
abstract class MineBase { 
     abstract void amethod() ; 
       static int i; 
}
 
public class Mine extends MineBase  { 
         public static void main( String argv[]) { 
                 int[] ar=new int[5]; 
                 for (i=0;i < ar.length;i++) 
                       System.out.println (ar[i]) ; 
          } 
}

/*
 	A	 A sequence of 5 0's will be printed 
B	Error: variable 'ar' may not have initialized .
C	 Error Mine must be declared abstract 
D	Error MineBase cannot be declared abstract.
 	 
 
 

 C
 
 
If we are extending an abstract class, we need to provide implementations for every
abstract method. If we are not able to provide the implementation, we have to 
declare our child class as abstract. Otherwise the compiler will flag an error 
message. 	 

	
 */

 
 



