package com.rathod.oops;
private class Innner_Class
{

	private class Account_Ifo
	{
		public void balanceDetails()
		{
			AVL_BAL = 10000;
			if(AVL_BAL<10000)	
			{
				int total = 0;
				total = total+(AVL_BAL*10/100);
				System.out.println("Total Balance = "+total);
			}
     	}
	}
	public final synchronized strictfp static void main(String... args)
	{

		AccountDetail a = new AccountDetail();
		a.balanceDetails();
		System.out.println("Hi EveryBody");
	}
}