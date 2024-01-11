package com.rathod.assignments.faq;

public class TryCatchThrows {

	static void validate(int age) throws ArithmeticException {
		try {
			if (age < 18)
				throw new ArithmeticException("not valid");
			// System.out.println("You cant vote");
			else
				System.out.println("welcome to vote");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code...");
	}

}
