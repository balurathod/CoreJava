package com.rathod.oops;
//143. Given:
 class SuperClass {
 public A getA() {
 return new A();
 }
 }
 class SubClass extends SuperClass {
 public B getA(){
 return new B();
 }
 }

 /*
Which is true?
A. Compilation will succeed if A extends B.
B. Compilation will succeed if B extends A.
C. Compilation will always fail because of an error in line 7.
D. Compilation will always fail because of an error in line 8.
Answer: B

*/