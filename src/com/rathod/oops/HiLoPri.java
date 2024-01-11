package com.rathod.oops;
//Demonstrate thread priorities
class Clicker  implements Runnable {
	int click = 0;
	Thread t;
	private boolean running = true;

		public Clicker(int p)		{
			t = new Thread(this);
			t.setPriority(p);
		}

		public void run()		{
			while(running) 		{
				click++;
			}
		}

		public void stop()  {
			running=false;
		}

		public void start() {
			t.start();
		}
}

public class HiLoPri			{
	public static void main(String[] args) 	{

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker(Thread.NORM_PRIORITY+2);
		Clicker lo = new Clicker(Thread.NORM_PRIORITY-2);

		lo.start();
		hi.start();

		try		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e) 		{
				System.out.println("Main thread interrupted");
		}
		
		lo.stop();
		hi.stop();

		//wait for child threads to terminate
		try		{
					   hi.t.join();
					   lo.t.join();
		}
		catch (InterruptedException e)		{
				System.out.println("InterruptedException caught");
		}

				System.out.println("Low-priority thread :  "+lo.click);
				System.out.println("Hi-priority thread :  "+hi.click);
	}
}
// lo = 32678065
//hi = 1613291673

