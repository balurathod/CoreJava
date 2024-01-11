package com.rathod.oops;
public class DeadLockTest {

	public static void main(String args[]) {

		final Friendly suresh = new Friendly("Suresh");
		final Friendly dinesh = new Friendly("Dinesh");

		suresh.becomeFriend(dinesh);
		dinesh.becomeFriend(suresh);

		new Thread(
				new Runnable() 
				{
					public void run() 
					{
						suresh.hug();
					}
					
			}, "Thread1").start();

		new Thread(new Runnable() {
			public void run() { dinesh.hug();}
		}, "Thread2").start();
		System.out.println("End main!!!");
	}
}
