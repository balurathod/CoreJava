package com.rathod.oops;
class NameRunnable implements  Runnable 
{
	public void run()
	{
      for (int x = 1 ; x<4  ; x++)
      {
		  System.out.println(" Run by " + Thread.currentThread().getName());
		  try
		  {
		  	Thread.sleep(1*60*1000);
		  }
		  catch (InterruptedException ex)
		  {  }
      }
	}
}
class ManyName
{
	public static void main(String[] args) 
	{
		NameRunnable nr = new NameRunnable();
		Thread one = new Thread(nr) ;          //number is not allowed as a ref name eg-Thread 1 = new Thread(nr) ;
		one.setName("BALU");
		Thread two = new Thread(nr);
		two.setName("Arun");
		Thread three = new Thread(nr);
		three.setName("Mahesh");
		
		one.start();
		two.start();
		three.start();
	}
}
