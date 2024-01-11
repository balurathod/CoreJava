package com.rathod.oops;
//138. Given:
 class ClassA {}
 class ClassB extends ClassA {}
 class ClassC extends ClassA {}
and:
 ClassA p0 = new ClassA();
 ClassB p1 = new ClassB();
 ClassC p2 = new ClassC();
 ClassA p3 = new ClassB();
 ClassA p4 = new ClassC();

 /*
Which three are valid? (Choose three.)
A. p0 = p1;
B. p1 = p2;
C. p2 = p4;
D. p2 = (ClassC)p1;
E. p1 = (ClassB)p3;
F. p2 = (ClassC)p4;











Answer: AEF

*/