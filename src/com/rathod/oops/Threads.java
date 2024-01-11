package com.rathod.oops;
class C15 extends Thread 
{
	private int i;
	public void run()//obj is not creatd of Thread in prog so it is userdefine 
	{
		i=1;
	}
	public static void main(String[] args) //this prog is no use of Thread
	{
		C15 a=new C15();
		a.run();
		System.out.println(a.i);
	}
}
//o/p->1

//a.run() was called instead of a.start(); so full prog run as a single thread(main)
//so a.run() is guaranted to complete.