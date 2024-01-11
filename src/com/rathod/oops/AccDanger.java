package com.rathod.oops;
//with Synchronization....
public class AccDanger implements Runnable
{
    private Account acct = new Account();
	public static void main(String[] args) 
	{
		AccDanger ad = new AccDanger();
		
		Thread one = new Thread(ad);
		Thread two = new Thread(ad);

             one.setName("Balu");
			 one.start();

			 two.setName("Dolly");
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
	private synchronized void  makeWithdrawal(int amt)
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
			System.out.println(" Not enough in Account For " + Thread.currentThread().getName() + " to withdraw " + acct.getBalance());
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


/*

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw                 But i want BALU & DOLLY alternatly how?
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0

G:\SCJP\Query\Solved>
G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Balu is going to Withdraw
Balu Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0

G:\SCJP\Query\Solved>javac AccDanger.java

G:\SCJP\Query\Solved>java AccDanger
Balu is going to Withdraw
Balu Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
Dolly is going to Withdraw
Dolly Completes the Withdrawal
 Not enough in Account For Dollyto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0
 Not enough in Account For Baluto withdraw 0

G:\SCJP\Query\Solved>

*/