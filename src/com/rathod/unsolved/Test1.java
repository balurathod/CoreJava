package com.rathod.unsolved;
//20. Given:
 interface TestA { String toString(); }//method declrcn

	public class Test1
	 {
	      public static void main(String[] args)
	          {
                    System.out.println(new TestA()    //constructor of interface.
	                    {
                         public String toString() { return "test"; }    //toString()-method of interface define ,is use to hide 
						                                                                 // address of obj.it static method of Object class.
                       }                 );
              }
    }

/*
What is the result?
A. test
B. null
C. An exception is thrown at runtime.
D. Compilation fails because of an error in line 1.
E. Compilation fails because of an error in line 4.
F. Compilation fails because of an error in line 5.
Answer: A

agin what is legal in s.o.p.(?)   ....(like above)
*/
