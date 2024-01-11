package com.rathod.oops;
class MyThread1 extends Thread 
{
	public void run()//thread define
	{
		System.out.println("Imp job running in MyThread");
		run(34);
		run("BALU"); 
		run(true);
	}
	public  int run(int i)    //user define 
	{
		System.out.println("Integer in run() is=" + i);
		return 12;
	}
	public  String run(String s)    //user define 
	{
		System.out.println("String in run() is=" + s);
		return " ";
	}
	public boolean run(boolean b)    //user define 
	{
		System.out.println("Boolean in run() is=" +b);
		return true;
	}
	public static void main(String[] args) 
	{
		Thread tm=new MyThread1();
		//MyThread1 tm=new MyThread1();              //run no problem.
		//int i = run();
		tm.run();
		
		
		
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