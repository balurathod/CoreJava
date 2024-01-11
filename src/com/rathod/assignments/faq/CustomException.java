package com.rathod.assignments.faq;

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

public class CustomException {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) throws InvalidAgeException {
//		try {
//			validate(13);
//			int sum = 0/10;
//			System.out.println("try block executed... ");
//		} finally {
//			System.out.println("finally block executed... ");
//		}
		try {
			validate(13);
			int sum = 0/10;
			System.out.println("try block executed... ");
		}catch(Exception e ) {
			e.printStackTrace();
		}catch(Throwable t ) {
			t.printStackTrace();
		}
//		catch(Object o ) {
//			o.printStackTrace();
//		}
		finally {
			System.out.println("finally block executed... ");
		}

		System.out.println("rest of the code...");
	}

}
