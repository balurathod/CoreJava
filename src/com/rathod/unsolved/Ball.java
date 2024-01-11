package com.rathod.unsolved;
//32. Given:
public class Ball
	 {
       public enum Color { RED, GREEN, BLUE };
       public void foo(){
     // insert code here
       for( Color c : Color.values() )
            { 
	          System.out.println(c); 
	        }
      }
     public static void main(String [] args)
	 {
	  
	  //b.foo();
	  }

 }


 /*
->o/p-->nothing why?



Which code inserted at line 6 causes the foo method to print RED, GREEN, and BLUE?
A. for( Color c : Color.values() )
B. for( Color c = RED; c <= BLUE; c++ )
C. for( Color c ; c.hasNext() ; c.next() )
D. for( Color c = Color[0]; c <= Color[2]; c++ )
E. for( Color c = Color.RED; c <= Color.BLUE; c++ )
Answer: A
*/