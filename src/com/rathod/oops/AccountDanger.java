package com.rathod.oops;
//without Synchronization....
public class AccountDanger implements Runnable
{
    private Account acct = new Account();
	public static void main(String[] args) 
	{
		AccountDanger ad = new AccountDanger();
		Thread one = new Thread(ad);
		Thread two = new Thread(ad);
             one.setName("Balu");
			 two.setName("Dolly");

			 one.start();
			 two.start();
	}
	public void run()
	{
		for (int x = 0 ; x < 5 ; x++)
		{
			makeWithdrawal(10);
			if (acct.getBalance() < 0)
			{
				System.out.println(" Account is overdrawn!. ");
			}
		}
	}
	private void makeWithdrawal(int amt)
	{
		if (acct.getBalance() >= amt)
		{
			System.out.println(Thread.currentThread().getName() +  " is going to Withdraw ");
		try
		{
			Thread.sleep(500);
		}
		catch (InterruptedException ie )
		{ }
		acct.withdraw(amt);
		System.out.println(Thread.currentThread().getName() +  " Completes the Withdrawal ");
		}else
		{
			System.out.println(Thread.currentThread().getName() +  " To Withdraw " + acct.getBalance());
		}
	}

}

class Account
{
	private int balance = 50;
	public int getBalance()
	{
		return balance;
	}
	public void withdraw(int amount)
	{
		balance = balance - amount;
	}

}