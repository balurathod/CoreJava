package com.rathod.oops;
class Innner_Class
{
	static int AVL_BAL = 9000;
	static int total = 0;
	private  class Account_Info
	{
		public  void balanceDetails()
		{
			
			if(AVL_BAL<10000)	
			{
				
				total = total+((AVL_BAL*10)/100);
				System.out.println("Total Balance = "+total);
			}
		}
	}
	public static void main(String[] args)
	{

		Account_Info a = new Account_Info();
		a.balanceDetails();
		System.out.println("Hi EveryBody");
	}
}
/*

G:\SCJP\SCJP Programs>javac Innner_Class.java
Innner_Class.java:21: non-static variable this cannot be referenced from a static context
                Account_Info a = new Account_Info();
                                 ^
1 error

G:\SCJP\SCJP Programs>javac Innner_Class.java
Innner_Class.java:7: inner classes cannot have static declarations
                public static void balanceDetails()
                                   ^
Innner_Class.java:21: non-static variable this cannot be referenced from a static context
                Account_Info a = new Account_Info();
                                 ^
2 errors

G:\SCJP\SCJP Programs>javac Innner_Class.java   //if u define Account_info class & balanceDetails() as STATIC 

G:\SCJP\SCJP Programs>java Innner_Class
Total Balance = 900
Hi EveryBody

G:\SCJP\SCJP Programs>javac Innner_Class.java

G:\SCJP\SCJP Programs>java Innner_Class      //if u define only Account_info class as STATIC
Total Balance = 900
Hi EveryBody

G:\SCJP\SCJP Programs>

*/