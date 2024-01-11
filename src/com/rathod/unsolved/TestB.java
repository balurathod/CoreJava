package com.rathod.unsolved;
//19. Given:
 class TestA 
	 {
    public void start()
		     { System.out.println("TestA"); }
	}
 public class TestB extends TestA
	 {
           public void start()
			   { System.out.println("TestB"); }
		   
           public static void main(String[] args) 
			   {
                      ((TestA)new TestB()).start();        //what is meaning of this st?
               }
      }//can i assign subclass obj to super class & vice-versa?

 /*
What is the result?
A. TestA    B. TestB      C. Compilation fails.
D. An exception is thrown at runtime.
Answer: B
*/