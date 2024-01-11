package com.rathod.assignments.faq;

public class ThreeThreadInOrder {

	static class PrintThread extends Thread {
		public PrintThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			for (int i = 0; i < 5; i++)
				System.out.println(getName() + ": " + i);
		}
	}

	public static void main(String args[]) {
		Thread thread1 = new PrintThread("A");
		Thread thread2 = new PrintThread("B");
		Thread thread3 = new PrintThread("C");

		thread1.run();
		thread2.run();
		thread3.run();
	}
}
