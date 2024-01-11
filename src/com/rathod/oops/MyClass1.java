package com.rathod.oops;
//221. Given:
 public class MyClass {
		public Integer startingI;
		public void methodA() {
			 Integer i = new Integer(25);
			 startingI = i;
			 methodB(i);
		 }
		 private void methodB(Integer i2) {
		 i2 = i2.intValue();

	 }
 }

/*
If methodA is invoked, which two are true at line 20? (Choose two.)
A. i2 == startingI returns true.
B. i2 == startingI returns false.
C. i2.equals(startingI) returns true.
D. i2.equals(startingI) returns false.
Answer: BC
*/