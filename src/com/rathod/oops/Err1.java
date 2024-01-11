package com.rathod.oops;
class Err1 
{
	public static void main(String[] args) 
	{
		double sal=5000.00;
		//sal=sal*15/100;            //wrong use: sal+=sal*15/100;
		sal+=sal*15/100;
		System.out.println("Incremented Salary="+sal);
	}
}
/*Run properly but.... result is not correct.
  By compairing of output of prog with manually calculated results,
  a progmr can guess presence of logical error.




G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java Err
Exception in thread "main" java.lang.NoSuchMethodError: main

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac Err1.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java Err1
Incremented Salary=750.0  for this (sal=sal*15/100;)

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>javac Err1.java

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>java Err1
Incremented Salary=5750.0   foe this (sal+=sal*15/100;)

G:\SCJP\Scjp6\ch5-Flowctrl Excepcn Assertions>
*/