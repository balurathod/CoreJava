package com.rathod.oops;
//152. Given:
 public class Hello {
	 String title;
	 int value;
	 public Hello() {
	     title += " World";
         }
     public Hello(int value) {
		 this.value = value;
		 title = "Hello";
		 Hello();
     }
     
 }

 /*
and:
30. Hello c = new Hello(5);
31. System.out.println(c.title);
What is the result?
A. Hello
B. Hello World
C. Compilation fails.
D. Hello World 5
E. The code runs with no output.
F. An exception is thrown at runtime.
Answer: C
*/