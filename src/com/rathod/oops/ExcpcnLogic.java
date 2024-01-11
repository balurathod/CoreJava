package com.rathod.oops;
//Is this legal...,
class ExceptionA extends Exception {}

class ExceptionB extends ExceptionA{}

class A
  {
	void thrower() throws ExceptionA
	{
		throw new ExceptionA();
	 }
  }
public class B extends A
	{
      void thrower() throws ExceptionB
	{
		throw new ExceptionB();
	 }
	}
/*

D:\SCJP\Oldscjp(1-5)\Exam2>javac B.java

D:\SCJP\Oldscjp(1-5)\Exam2>java B
Exception in thread "main" java.lang.NoSuchMethodError: main
*/
