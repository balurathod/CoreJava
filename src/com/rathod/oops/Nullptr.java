package com.rathod.oops;
//70. Given:
 try {
 //34. some code here
} catch (NullPointerException e1) {
 System.out.print("a");
 } catch (RuntimeException e2) {
 System.out.print("b");
 } finally {
 System.out.print("c");
 }

 /*
What is the result if a NullPointerException occurs on line 34?
A. c
B. a
C. ab
D. ac
E. bc
F. abc
Answer: D
*/