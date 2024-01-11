package com.rathod.assignments.faq;

public class ThreeThreadSeq {
	/**
	 * devinline.com
	 */
	static Object monitor = new Object();

	static boolean one = true;
	static boolean two = false;
	static boolean three = false;

	public static void main(String[] args) {

		Thread t1 = new Thread(new SequenceDisplayImpl(1));
		Thread t2 = new Thread(new SequenceDisplayImpl(2));
		Thread t3 = new Thread(new SequenceDisplayImpl(3));
		t1.start();
		t2.start();
		t3.start();

	}

	static class SequenceDisplayImpl implements Runnable {

		int threadId;

		SequenceDisplayImpl(int threadId) {
			this.threadId = threadId;
		}

		public void run() {
			print();
		}

		private void print() {
			try {
				while (true) {
					Thread.sleep(500);
					synchronized (monitor) {
						if (1 == threadId) {
							if (!one) {
								monitor.wait();
							} else {
								System.out.print(threadId + " ");
								one = false;
								two = true;
								three = false;
								monitor.notifyAll();
							}
						}
						if (2 == threadId) {
							if (!two) {
								monitor.wait();
							} else {
								System.out.print(threadId + " ");
								one = false;
								two = false;
								three = true;
								monitor.notifyAll();
							}
						}
						if (3 == threadId) {
							if (!three) {
								monitor.wait();
							} else {
								System.out.print(threadId + " ");
								one = true;
								two = false;
								three = false;
								monitor.notifyAll();
							}
						}
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}