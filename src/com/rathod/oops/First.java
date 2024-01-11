package com.rathod.oops;
class Emp {
 private int empno;
 String name;
 double salary;

	Emp(int i) {
		System.out.println(i+" Employee constructed");
	}
	protected void finalize () {

		try {
			System.out.println("\t\tfinalized called");			
			super.finalize();
		}
		catch(Throwable t) {
			
		}
	}
	
}

public class First {
  public static void main(String args[]) {
	System.out.println("Hello Adv Java");
	for(int i=0;i<5000;i++) {
		Emp x = new Emp(i);
	}
  }
}