package com.rathod.oops;
//Now Actual THREAD r running.
class   FooRunnable implements Runnable //this intrfc have only one metd -p.v. run() 
{
	public void run()
	{
		for (int i=0;i<6 ;i++ )
		{
			System.out.println("Runnable is running");
			System.out.println("Thread is "+Thread.currentThread().getName());
		}
	}
}
public class Testthread
{
	public static void main(String[] args) 
	{
		FooRunnable r=new FooRunnable();
		Thread t=new Thread(r);//means new thread r created(in new STACK).
		r.run();              //directly run due to  userdefine...
		
		System.out.println("Hello Thread ");
		t.start();            //run by thread.
	//	r.start();       //Error:can't find symbol.start() is not define in user define class(Testthread) 
	   

		Thread r1=(Thread)t;  //type casting how to conclud it?

		r1.start();
		t.run();    //t - ref of supr class (due to IS-A test)//can't run without ref(r).
	}
}
