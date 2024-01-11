package com.rathod.oops;
class Flag 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		if (flag = true) {
		System.out.println("true");
		} else {
		System.out.println("false");
		}

		System.out.println("Hello World!");
	}
}
/*
if (flag = true)

G:\SCJP\Query\Solved>javac Flag.java

G:\SCJP\Query\Solved>java Flag
true
Hello World!



if (flag == true)

G:\SCJP\Query\Solved>javac Flag.java

G:\SCJP\Query\Solved>java Flag
false
Hello World!

G:\SCJP\Query\Solved>



*/