package com.rathod.oops;

//118. Given:

 Runnable r = new Runnable() {
    public void run() {
    System.out.print("Cat");
    }
 };
 Thread t = new Thread(r) {
     public void run() {
    System.out.print("Dog");
    }
 };
 t.start();


 /*
What is the result?
A. Cat
B. Dog
C. Compilation fails.
D. The code runs with no output.
E. An exception is thrown at runtime.
Answer: B
*/