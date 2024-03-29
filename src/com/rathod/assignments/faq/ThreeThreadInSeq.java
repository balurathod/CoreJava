package com.rathod.assignments.faq;

public class ThreeThreadInSeq {

	int status = 1;

	public static void main(String[] args) {

		ThreeThreadInSeq notifyAllExample = new ThreeThreadInSeq();

		A1 a = new A1(notifyAllExample);
		B1 b = new B1(notifyAllExample);
		C1 c = new C1(notifyAllExample);

		a.start();
		b.start();
		c.start();
	}
}

class A1 extends Thread {
	ThreeThreadInSeq notifyAllExample;

	A1(ThreeThreadInSeq notifyAllExample) {
		this.notifyAllExample = notifyAllExample;
	}

	@Override
	public void run() {

		try {
			synchronized (notifyAllExample) {

				for (int i = 0; i < 100; i++) {

					if (notifyAllExample.status != 1) {
						notifyAllExample.wait();
					}

					System.out.print("A ");
					notifyAllExample.status = 2;
					notifyAllExample.notifyAll();
				}

			}
		} catch (Exception e) {
			System.out.println("Exception 1 :" + e.getMessage());
		}

	}

}

class B1 extends Thread {

	ThreeThreadInSeq notifyAllExample;

	B1(ThreeThreadInSeq notifyAllExample) {
		this.notifyAllExample = notifyAllExample;
	}

	@Override
	public void run() {

		try {
			synchronized (notifyAllExample) {

				for (int i = 0; i < 100; i++) {

					if (notifyAllExample.status != 2) {
						notifyAllExample.wait();
					}

					System.out.print("B ");
					notifyAllExample.status = 3;
					notifyAllExample.notifyAll();
				}

			}
		} catch (Exception e) {
			System.out.println("Exception 2 :" + e.getMessage());
		}

	}
}

class C1 extends Thread {

	ThreeThreadInSeq notifyAllExample;

	C1(ThreeThreadInSeq notifyAllExample) {
		this.notifyAllExample = notifyAllExample;
	}

	@Override
	public void run() {

		try {
			synchronized (notifyAllExample) {

				for (int i = 0; i < 100; i++) {

					if (notifyAllExample.status != 3) {
						notifyAllExample.wait();
					}

					System.out.print("C ");
					notifyAllExample.status = 1;
					notifyAllExample.notifyAll();
				}

			}
		} catch (Exception e) {
			System.out.println("Exception 3 :" + e.getMessage());
		}

	}
}