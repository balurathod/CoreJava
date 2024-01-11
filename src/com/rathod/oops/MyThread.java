package com.rathod.oops;
class MyThread extends Thread// or implements Runnable here Thread is created 
{
	public void run()         //to define a THREAD u need a palce to ur run().
	                          //& extend d class THREAD or implmntg RUNNABLE.  
	{
         System.out.println("Imp job running in MyThread");
	}
	public static void main(String[] args) 
	{
		//MyThread mt=new Thread();   //error=incompatible type error  how?Bcz Is-A test fail


    //Thread is instantiating & creating obj of MyThread class. vt ref of Thread class
		Thread mt=new MyThread();//run vt o/p. but clear d concept of this st.  Ans-Is-A test succucced.


		//Thread mt=new Thread();     //compile but no o/p   why? bcz run() is in sub class not in thread class

		System.out.println("Hello World! Welcome for THREAD.");
		mt.run();
		//mt.start();  without this method Thread is not started to run.
	}
}
/*
--poor designing of (code)thread.  why?
--what is diff of user define run() & thread define run()?
   Both must b implmnted in ur class.In fun main() Thread vl decide that it is user define or Thread define
   On this conclusion
      -->is Thread class extended vt ur class.
	  
	  -->if yes then is obj of Thread or using ref of Thread creates obj of subclass of thread 
	     
	  -->if yes then & only then run() is THREAD define but not started.


	  -->for starting THREAD in Ur prog u must declared this 
	         "ref.start();"


	  -->if obj of Thread or its subclass's obj is not created then run() is user define.

--what is d role of thread here?how it's flow?
   -->good que. Thread creates new STACK for seprt executing & it's behaviour is not fixed.
   but it is a child THREAD of MAIN,executed & end in main() only.
   



--u r free to overload d run() in ur Thread subclass.   Yes

--strictly....Thread class expects run() vt no arg.

*/