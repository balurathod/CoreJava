package com.rathod.oops;
class StaticSynchro 
{
	float f = 45.78f; 
	public static synchronized void main(String[] args) 
	{
		StaticSynchro ss = new StaticSynchro();
		ss.getCount();
		System.out.println("Float Value is f = " + ss.f);
	}
	public static int getCount()
	{
		synchronized(StaticSynchro.class)   //Meaning? "StaticSynchro.class" called class literal 
		{
			System.out.println("In getCount");
			return 0;
		}
	}
	public static void classMethod()
	{
		Class c = Class.forName("StaticSynchro");//forName()-factory method
		synchronized (c)
		{
			System.out.println(" In Synchro block");
		}
	}
}
/*
synchronized(StaticSynchro.class)- spcl featur in java lang dat tell d complr(who tells d jvm) go & find me d 
  instance of Class dat repsnt d class called StaticSynchro.    

//Meaning? "StaticSynchro.class" called class literal 
  
*/