package com.rathod.multiThreading;

class Common {
		public synchronized void synchronizedMethod1() {  
		System.out.println("synchronizedMethod1 called");  
		try {  
		Thread.sleep(1000);  
		} catch (InterruptedException e) {  
		e.printStackTrace();  
		}  
			System.out.println("synchronizedMethod1 done");  
			}  
			public void method1() {  
			System.out.println("Method 1 called");  
			try {  
			Thread.sleep(1000);  
			} catch (InterruptedException e) {  
			e.printStackTrace();  
			}  
			System.out.println("Method 1 done");  
			}  
			}  

		//view plainprint?
		public class MyThread extends Thread {  
		private int id = 0;  
		private Common common;  
		public MyThread(String name, int no, Common object) {  
		super(name);  
		common = object;  
		id = no;  
		}  
		  
		public void run() {  
		System.out.println("Running Thread" + this.getName());  
		try {  
		if (id == 0) {  
		common.synchronizedMethod1();  
		common.method1();  
		}  
			} catch (Exception e) {  
			e.printStackTrace();  
			}  
			}  
			  
			public static void main(String[] args) {  
			Common c = new Common();  
			MyThread t1 = new MyThread("MyThread-1", 0, c);  
			MyThread t2 = new MyThread("MyThread-2", 1, c);  
			t1.start();  
			t2.start();  
			}  
			}  
/*
		//ere is the output of the program view plainprint?
			Running ThreadMyThread-1  
			synchronizedMethod1 called  
			Running ThreadMyThread-2  
			Method 1 called  
			synchronizedMethod1 done  
			Method 1 done 
			
			 
			 
			 1.	public class Common {  
2.	public synchronized void synchronizedMethod1() {  
3.	System.out.println("synchronizedMethod1 called");  
4.	try {  
5.	Thread.sleep(1000);  
6.	} catch (InterruptedException e) {  
7.	e.printStackTrace();  
8.	}  
9.	System.out.println("synchronizedMethod1 done");  
10.	}  
11.	  
12.	public synchronized void synchronizedMethod2() {  
13.	System.out.println("synchronizedMethod2 called");  
14.	try {  
15.	Thread.sleep(1000);  
16.	} catch (InterruptedException e) {  
17.	e.printStackTrace();  
18.	}  
19.	System.out.println("synchronizedMethod2 done");  
20.	}  
21.	}  
view plainprint?
22.	public class MyThread extends Thread {  
23.	private int id = 0;  
24.	private Common common;  
25.	  
26.	public MyThread(String name, int no, Common object) {  
27.	super(name);  
28.	common = object;  
29.	id = no;  
30.	}  
31.	  
32.	public void run() {  
33.	System.out.println("Running Thread" + this.getName());  
34.	try {  
35.	if (id == 0) {  
36.	common.synchronizedMethod1();  
37.	} else {  
38.	common.synchronizedMethod2();  
39.	}  
40.	} catch (Exception e) {  
41.	e.printStackTrace();  
42.	}  
43.	}  
44.	  
45.	public static void main(String[] args) {  
46.	Common c = new Common();  
47.	MyThread t1 = new MyThread("MyThread-1", 0, c);  
48.	MyThread t2 = new MyThread("MyThread-2", 1, c);  
49.	t1.start();  
50.	t2.start();  
51.	}  
52.	}  

*/