package com.rathod.exceptionHandling;
// If Exception raised at Hello statement and corresponding catch block is not available

class SimplyException {
	public static void main(String[] args) throws Exception {

		System.out.println("Hi ");
		System.out.println(10 / 0);
		System.out.println("Suresh");

		System.out.println("Ramesh");
	}
}

/*
 * o/p- Hi Exception in thread "main" java.lang.ArithmeticExceptioin: / by zero
 * at Exc_Test9.main(Exc_Test9.java : 10)
 * 
 * Abnormal Termination
 */