package com.rathod.oops;
public class SyncTest {
	public static void main(String args[]) throws InterruptedException {

		Account a1 = new Account(1,"Suresh",1000f);

		Transaction t1 = new Transaction(a1,200);
		Transaction t2 = new Transaction(a1,300);
		Transaction t3 = new Transaction(a1,500);

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		System.out.println("FINAL BAL :"+a1.getBalance());;
	}
}

class Transaction extends Thread {

   Account accObj;
   float amount;

	public Transaction(Account a, float amt) {
		accObj=a;
		amount = amt;
	}

	public void run() {
		accObj.deposit(amount);
	}
}

class Account {

  private int accNumber;
  private String accName;
  private float bal;

	public Account(int acno, String name, float b) 	{
		accNumber = acno;
		accName = name;
		bal=b;
	}

	public float getBalance() {
	     try {
		Thread.sleep(1500);
	     }
           catch(InterruptedException e) {
	     }
	     return bal;
	}

	private void setBalance(float b) {
	     try {
		Thread.sleep(1500);
		bal=b;
	     } 
	     catch(InterruptedException e) {
	     }
	}

	public   void deposit(float amt)  {

		String threadName = Thread.currentThread().getName();
		
		System.out.println("1----------------------------------------");
		System.out.println("2----------------------------------------");
		System.out.println("3----------------------------------------");
		System.out.println("4----------------------------------------");
		
		synchronized (this) {
			float temp;
			System.out.println("Getting the balance ...");
			temp = getBalance();
			System.out.println("Balance got : " + temp);
			temp = temp + amt;
			System.out.println("\t\tSetting the balance ...");
			setBalance(temp);
			System.out.println("\t\tBalance set : " + temp);
		}
		//System.out.println("Depositing amount by "+threadName);		
		System.out.println("5----------------------------------------");
		System.out.println("6----------------------------------------");
		System.out.println("7----------------------------------------");
		System.out.println("8----------------------------------------");
	}
}
