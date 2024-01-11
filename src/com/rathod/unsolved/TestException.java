package com.rathod.unsolved;
//69. Click the Exhibit button.
Class TestException
 public class TestException extends Exception {
 }
Class A:
public class A {

 public String sayHello(String name) throws TestException {

 if(name == null) {
 throw new TestException();
 }

return "Hello " + name;
 }

 }

 /*
A programmer wants to use this code in an application:
45. A a = new A();
46. System.out.println(a.sayHello("John"));
Which two are true? (Choose two.)
A. Class A will not compile.
B. Line 46 can throw the unchecked exception TestException.
C. Line 45 can throw the unchecked exception TestException.
D. Line 46 will compile if the enclosing method throws a TestException.
E. Line 46 will compile if enclosed in a try block, where TestException is caught.
Answer: DE


How?*/