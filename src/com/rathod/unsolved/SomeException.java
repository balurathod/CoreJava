package com.rathod.unsolved;
//68
SomeException:
public class  SomeException {}
Class A: public class A
{
	public void doSomething(){}
}
Class B:
public class B extends A
{
public void doSomething()throws SomeException{}

}
//D-compilation of class B vl fail & compilation of class A vl succeed