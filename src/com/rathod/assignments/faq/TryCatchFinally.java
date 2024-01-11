package com.rathod.assignments.faq;

public class TryCatchFinally {

	public int trymtd() {
		int i = 10;
		try {
			System.out.println("In try");
			return i;

		} /*
		 * catch (Exception e) { e.printStackTrace(); }
		 */finally {
			System.out.println("In finly");
		}
		// return i;
	}

	public static void main(String[] args) {
		TryCatchFinally tcf = new TryCatchFinally();
		tcf.trymtd();

	}

}
