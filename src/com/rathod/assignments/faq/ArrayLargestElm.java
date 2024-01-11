package com.rathod.assignments.faq;

public class ArrayLargestElm {
	public static void main(String[] args) {

		int arr[] = { 56, 120, 6, 1, 87 };
		int largest = arr[0];
		int smallest = arr[0];
		int smallestIndex = 0;
		int LargestIndex = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > largest) {

				largest = arr[i];
				LargestIndex = i;
			} else if (arr[i] < smallest) {

				smallest = arr[i];
				smallestIndex = i;
			}			
		
		}

		System.out.println("largest value from array " + largest+" at index " + LargestIndex);
		System.out.println("smallest value from array " + smallest+" at index "+smallestIndex);

	}
}
