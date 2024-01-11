package com.rathod.oops;
//144. Given:
 interface A { public void aMethod(); }
 interface B { public void bMethod(); }
 
 interface C extends A,B { public void cMethod(); }
 class D implements B {
 public void bMethod(){}
 }
 class E extends D implements C {
 public void aMethod(){}
 public void bMethod(){}
 public void cMethod(){}
 }

 /*
What is the result?
A. Compilation fails because of an error in line 3.
B. Compilation fails because of an error in line 7.
C. Compilation fails because of an error in line 9.
D. If you define D e = new E(), 
then e.bMethod() invokes the version of bMethod() defined in Line 5.
E. If you define D e = (D)(new E()),
 then e.bMethod() invokes the version of bMethod() defined in Line 5.
F. If you define D e = (D)(new E()),
 then e.bMethod() invokes the version of bMethod() defined in Line 9.
Answer: F
*/