package com.rathod.multiThreading;
class ThreadMethod1
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread : " + t);
		System.out.println("Name Of The Current Thread : " + t.getName());
		System.out.println("Priority : " + t.getPriority());
		t.setName("MyThread");
		System.out.println("Afer Name Changed" + t.getName());
		t.setPriority(2);
		System.out.println("Afetr Priority Changed : " + t);
	}
}

/* 
Vedisoft : Java - Module 1 "Desktop Technologies"


Vedisoft
Plot No. 173, Zone II, M.P. Nagar,
Bhopal.
Phone : 0755 - 6541546
Email : contact@vedisoft.com
Web : www.vedisoft.com
*/