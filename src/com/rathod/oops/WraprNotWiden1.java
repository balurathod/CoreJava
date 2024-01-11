package com.rathod.oops;
class WraprNotWiden 
{
	public static void main(String[] args) 
	{
		WraprNotWiden wnw = new WraprNotWiden();
		wnw.test(new Integer(5));     //can't widen Int to Long
	}
	void test(Long x)
	{
		System.out.println("Wrapper classes r never Widening they r peers to 1 another.");
	}
}
/*

why Integer not widen into Long ?

Ans-Bcoz for Wodening IS-A test is imp under Inheritance.
    i.e-Reference widening depends on inheritance.

	The Wrapper classes r peers to one another,so IS-A test is FAILs
	Because of this it is not legal to widen from one wrappper class to another.
	i.e.-it is NOT valid to say Short IS-A Integer.





G:\>cd scjp\Query

G:\SCJP\Query>javac WraprNotWiden.java
WraprNotWiden.java:6: test(java.lang.Long) in WraprNotWiden cannot be applied to (java.lang.Integer)
                wnw.test(new Integer(5));     //can't widen Int to Long
                   ^
1 error

G:\SCJP\Query>

*/