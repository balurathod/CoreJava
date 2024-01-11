package com.rathod.oops;
class C15 extends Thread 
{
	private int i;
	public void run()
	{
		i=1;
	}
	public static void main(String[] args) 
	{
		C15 a=new C15();
		Thread ad = new Thread();
		ad.run();    // call run() of Thread bt it not affect to prog
		a.run();
		System.out.println(a.i);
	}
}
//Thread is not use/implnt in this prog run() method use as a method of 
//c15 class only.
//this is not related vt thread.