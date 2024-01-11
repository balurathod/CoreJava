package com.rathod.multiThreading;
class SingleInstanceMultiThread extends Thread 
{
	public void run()
	{
		System.out.println("Imp job running in MyThread");
	}
	public void run(int s)    //never execute in thread flow.
	{
		System.out.println("String in run() is=" + s);
	}
	public static void main(String[] args) 
	{
		Thread tm=new SingleInstanceMultiThread();
		SingleInstanceMultiThread tm1=new SingleInstanceMultiThread();              //run no problem.
		System.out.println("Hello World!");
		tm.run();
		tm1.run(6);    //this mtd doesnt impact on thread, its run like normal mtd.
		
		
	}
}

/*

all method of process executes under thread 
means only from a single stack.


u dirctly call it[run(int s)] means it calling from next stack.
so Thread never executes d method from two diff stack at a time.




G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java

G:\SCJP\Scjp6\ch9-Threads>java MyThread1
Hello World!

G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java
MyThread1.java:16: cannot find symbol
symbol  : variable bal
location: class MyThread1
                tm.run(bal);
                       ^
1 error

G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java
MyThread1.java:16: run() in java.lang.Thread cannot be applied to (java.lang.Str
ing)
                tm.run("bal");
                  ^
1 error

G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java

G:\SCJP\Scjp6\ch9-Threads>java MyThread1
Hello World!
Imp job running in MyThread
Imp job running in MyThread

G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java

G:\SCJP\Scjp6\ch9-Threads>java MyThread1
Hello World!
Imp job running in MyThread

G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java
MyThread1.java:17: run() in java.lang.Thread cannot be applied to (int)
                tm.run(2);
                  ^
1 error

G:\SCJP\Scjp6\ch9-Threads>javac MyThread1.java

G:\SCJP\Scjp6\ch9-Threads>java MyThread1
Hello World!
Imp job running in MyThread
Imp job running in MyThread

G:\SCJP\Scjp6\ch9-Threads>java MyThread1

*/