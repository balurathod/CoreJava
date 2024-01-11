//thread execution not fix, its decided by os on time
package com.rathod.multiThreading;
class NameRunnables implements Runnable 
{
	public void run()
	{
		for (int x=1;x<=3 ;x++ )
		{
			System.out.println("Run by "+ Thread.currentThread().getName() + " X is "+ x);
		}
	}
}
public class ManyName
{    
	public static void main(String[] args) 
	{
		NameRunnables nr=new NameRunnables();
		
		Thread one=new Thread(nr);
		Thread two=new Thread(nr);
		Thread three=new Thread(nr);

		one.setName("   Arun ");
		two.setName("   Ankita");
		three.setName(" Nikita");

		one.start();
		two.start();
		three.start();
		
	}
}
/*
so behaviour of THREAD is not guaranted...
when we ran it.




so we conclued that...

Each thread will start, & each thread will run to completion.

AND....

Within each THREAD ,things will happen in a predictable order.
But d action of different thread can mix together in unpredictable ways.




plz see.....Each o/p is in different waqys without compilation...



G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by ArunX is 1
Run by NikitaX is 1
Run by NikitaX is 2
Run by AnkitaX is 1
Run by AnkitaX is 2
Run by NikitaX is 3
Run by ArunX is 2
Run by ArunX is 3
Run by AnkitaX is 3

G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by  Arun X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by  Ankita X is 1
Run by  Arun X is 2
Run by  Ankita X is 2
Run by  Arun X is 3
Run by  Ankita X is 3

G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by  Arun X is 0
Run by  Arun X is 1
Run by  Nikita X is 0
Run by  Nikita X is 1
Run by  Ankita X is 0
Run by  Ankita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by  Arun X is 2
Run by  Ankita X is 2
Run by  Ankita X is 3
Run by  Arun X is 3

G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by  Arun ,X is 1
Run by  Nikita ,X is 1
Run by  Ankita ,X is 1
Run by  Nikita ,X is 2
Run by  Nikita ,X is 3
Run by  Arun ,X is 2
Run by  Ankita ,X is 2
Run by  Ankita ,X is 3
Run by  Arun ,X is 3

G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by     Arun ,X is 1
Run by   Nikita ,X is 1
Run by     Ankita ,X is 1
Run by   Nikita ,X is 2
Run by   Nikita ,X is 3
Run by     Arun ,X is 2
Run by     Ankita ,X is 2
Run by     Ankita ,X is 3
Run by     Arun ,X is 3

G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun X is 1
Run by  NikitaX is 1
Run by    AnkitaX is 1
Run by    AnkitaX is 2
Run by    AnkitaX is 3
Run by  NikitaX is 2
Run by  NikitaX is 3
Run by    Arun X is 2
Run by    Arun X is 3

G:\SCJP\Scjp6\ch9-Threads>javac ManyNames.java

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by    Arun  X is 2
Run by    Arun  X is 3

G:\SCJP\Scjp6\ch9-Threads>
G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by    Arun  X is 2
Run by    Arun  X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by    Ankita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Arun  X is 2
Run by    Ankita X is 2
Run by    Arun  X is 3
Run by    Ankita X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by    Arun  X is 2
Run by    Arun  X is 3
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by    Arun  X is 2
Run by    Arun  X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by    Arun  X is 2
Run by    Arun  X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by    Arun  X is 2
Run by    Arun  X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by    Arun  X is 2
Run by    Arun  X is 3
Run by  Nikita X is 1
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by  Nikita X is 2
Run by    Ankita X is 3
Run by  Nikita X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by    Arun  X is 2
Run by  Nikita X is 1
Run by    Ankita X is 1
Run by  Nikita X is 2
Run by  Nikita X is 3
Run by    Arun  X is 3
Run by    Ankita X is 2
Run by    Ankita X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames
Run by    Arun  X is 1
Run by  Nikita X is 1
Run by  Nikita X is 2
Run by    Ankita X is 1
Run by    Ankita X is 2
Run by    Ankita X is 3
Run by  Nikita X is 3
Run by    Arun  X is 2
Run by    Arun  X is 3

G:\SCJP\Scjp6\ch9-Threads>java ManyNames






*/