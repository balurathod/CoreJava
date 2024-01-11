package com.rathod.oops;
//User define Exception
//to throw whenever bal amt is below Rs. 1000.
class  MyException extends Exception
{
	//store acc inf..
	private static int accno[]={1001, 1002, 1003, 1004, 1005};
	private static String name[]={"Balu","Vitu","Pradip","Kisor","Deepali","Nilima"};
	private static double bal[]={10000.00,120000.00,5600.00,999.00,1100.55};

	//default constructor
	MyException()
	{
		//no/never  para in default constr.. 
	}

	//Parameterized constr
	MyException(String str)
	{
		super(str);
	}
	public static void main(String[] args) 
	{
		try
		{
			//display heading foe table
			System.out.println("AccNo"+"\t"+"Balance");

			//display actual acc inf
			for (int i=0;i<5 ;i++)
			{
				System.out.println(accno[i]+"\t"+bal[i]);

				//display own exception if bal<1000
				if (bal[i]<1000)
				{
					MyException me=new MyException("Balance Amt is less");
					throw me;
				}
			}
		}
		catch (MyException me)
		{
			me.printStackTrace();
		}
	}
}
