package com.rathod.oops;
class A1 extends Thread 
{
	public void run()  //necesry for implmntng Thread bt it is just user define
	                   //  here bcz obj of Thred is not created in main() 
	{
		System.out.println("A");
	}
}
class B
{
	public static void main(String[] args) 
	{
		A1 a=new A1();
		a.start();
 //   	a.start();   //illegal st. bcz a thread is start at once,before it end u can't restart it. 
	}
}

/*

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>java B
A
Exception in thread "main" java.lang.IllegalThreadStateException
        at java.lang.Thread.start(Unknown Source)
        at B.main(B.java:15)

D:\SCJP\Oldscjp(1-5)\Spiral\Exam3>
*/