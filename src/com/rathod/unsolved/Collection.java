package com.rathod.unsolved;
//62. Given:
public static Collection get() {
	 Collection sorted = new LinkedList();
	 sorted.add("B"); sorted.add("C"); sorted.add("A");
	 return sorted;
 }
 public static void main(String[] args) {
	 for (Object obj: get()) {
	 System.out.print(obj + ", ");
 }
 }

 /*
What is the result?    how to run COLLECTION Prog?
A. A, B, C,
B. B, C, A,
C. Compilation fails.
D. The code runs with no output.
E. An exception is thrown at runtime.
Answer: B
*/