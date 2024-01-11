package com.rathod.oops;
class AB  extends Thread  //Thread class extending here bt no use/effect on appl.
{
	private int i;
	//public void run(){ i=1;} then also run() mtd run & give o/p-0 due to THREAD class only.

	public static void main(String[] args) 
	{
		AB a=new AB();
		a.run();
		System.out.println(a.i);
	}
}
//how to identify how many no. of THREADs r running?


/*

G:\SCJP\Query>java AB     //when Thread extnded or not & run() mtd define only.
1

G:\SCJP\Query>javac AB.java      //when Thread extnded & run() mtd declare only.

G:\SCJP\Query>java AB
0

G:\SCJP\Query>javac AB.java       //when Thread not extended vt above class.
AB.java:9: cannot find symbol
symbol  : method run()
location: class AB
                a.run();
                 ^
1 error

G:\SCJP\Query>


*/