package com.rathod.unsolved;
//71. Given:
 class A {
	 public void process() throws IOException 
	 {
		 System.out.print("A,");
	 }
}
 class B extends A 
{
     public void process() throws IOException {
		 super.process();
		 System.out.print("B,");
 throw new IOException();
	}
 
 }
 class Excepcn{
	 public static void main(String[] args)
	 {
	 
		try { 
		 new B().process();    //meaning? 
	     }
		catch (IOException e) 
		 {
			 System.out.println("Exception"); 
		 }
	}
 }

/*What is the result?
A. Exception
B. A,B,Exception
C. Compilation fails because of an error in line 11.
D. Compilation fails because of an error in line 5.
E. A NullPointerException is thrown at runtime.
Answer: D




public void divide(int a, int b) {
	try {
		int c = a / b;
	} catch (Exception e) {
		System.out.print("Exception ");
	} finally {
		System.out.println("Finally");
}



options
A)Prints out: Exception Finally
B)Prints out: Finally
C)Prints out: Exception
D)Compile with error

Correct answer is : D

Explanations : finally block always executed whether exception occurs or not. 
	0/3 = 0 Does not throws exception.



*/