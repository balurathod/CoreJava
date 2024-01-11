package com.rathod.assignments.faq;

public class MissingElementFromArray {
	static int[] arry;
	public static void main(String[] args) {

		int[] arr = {1,2,3,5,6,7,8,9,10};// will be the sum of the numbers in the array.
		int sum = 0;
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				idx = i;
			} else {
				sum += arr[i];
			}
		}

		// the total sum of numbers between 1 and arr.length.
		int total = (arr.length + 1) * arr.length / 2;

		System.out.println("missing number is: " + (total - sum) + " at index " + idx);
		
		// Assuming that the array contains 99 distinct integers between 1..99
		// and empty slot value is zero
		
		int XOR = 0;
		for(int i=0; i<100; i++) {
		    if (arry[i] != 0)
		        XOR ^= arry[i];
		    XOR ^= (i + 1);
		}
		System.out.println("missing-"+XOR);
	}
}
