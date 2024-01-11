package com.rathod.oops;
//74
static class A    //Not a concept of static class in java,
                  //static aply only on inner class. 
{
	public void process()throws Exception
		{
		    throw new Exception();
		}
}
static class B5 extends A
{
	void process()
		{
		     System.out.print("B,"); 
		}
	public static void main(String[] args) 
	{
		new B5().process();
	}
}

/*Ans-->B    but
                         ^
D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>javac B5.java
B5.java:2: modifier static not allowed here
static class A
       ^
B5.java:6: modifier static not allowed here
static class B5 extends A

	                                ^

D:\SCJP\Oldscjp(1-5)\Spiral\Exam4>

*/