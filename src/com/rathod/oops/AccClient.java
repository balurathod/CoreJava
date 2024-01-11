package com.rathod.oops;
import java.rmi.*;
import java.rmi.server.*;
import java.io.*;


public class AccClient
{
	public  static void main(String args[])
	{
		try
		{
			int choice;
			String url = "rmi://192.168.41.43:1099/MyObj";
			AccIntf inf;
			System.out.println("Looking for object on the server");
			inf = (AccIntf) Naming.lookup(url);
			System.out.println("Aha!! got the reference...");
			System.out.println("the client can call now the server methods...");
			do
			{
				System.out.println("Scandle Free bank..");
				System.out.println("==============================");
				System.out.println();
				System.out.println("main menu");
				System.out.println("------------------------");
				System.out.println("1. add new account");
				System.out.println("2. know yr balance");
				System.out.println("3. withdraw");
				System.out.println("4. deposit");
				System.out.println("5. exit");
				System.out.println("\n\nEnter yr choice from 1 to 5 >");
				BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				choice = Integer.parseInt(buff.readLine());
				Account acc;
				switch (choice)
				{
				case 1:		System.out.println("Enter account details : ");
							acc = new Account(IOServices.getInt(),IOServices.getString(),IOServices.getInt());
							inf.createAccount(acc);
							System.out.println("account created...");
							break;
				case 2:
							System.out.print("\nEnter account number: ");
							acc = inf.getDetails(IOServices.getInt());
								System.out.println("acno :"+acc.getAcno());
								System.out.println("acname :"+acc.getName());
								System.out.println("balance :"+acc.getBalance());
								break;
				case 3:
							System.out.print("\nEnter account number: ");
							int acno = IOServices.getInt();
							
							System.out.print("\nEnter withdraw amount: ");
							int amt = IOServices.getInt();
							inf.withDraw(acno,amt);
							System.out.println("withdraw is over");
							break;
				case 4:
							System.out.print("\nEnter account number: ");
							acno = IOServices.getInt();
							System.out.print("\nEnter deposit amount: ");
							amt = IOServices.getInt();
							inf.deposit(acno,amt);
							System.out.println("amount deposit is over");
							break;
				case 5:
							break;
				default:
							System.out.println("invalid choice");
				}
		}while(choice!=5);
		}
		catch(Exception e)
		{
			System.out.println("error...."+e);
		}

							System.out.println("end of main");
	}
}

