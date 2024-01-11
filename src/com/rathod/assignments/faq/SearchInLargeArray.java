package com.rathod.assignments.faq;

public class SearchInLargeArray {
	int[] arr = {2, 1, 2, 3, 4, 3, 2, 3, 4, 5, 6, 5, 4, 3, 4};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int searchArray(int[] arr, int i, int elem) {

	    if (i > arr.length - 1 || i < 0) {
	        return -1;
	    }

	    if (arr[i] == elem) {
	            return i;

	    } else {
	            int diff = Math.abs(elem - arr[i]);
	            int index = searchArray(arr, i + diff, elem);
	            if (index == -1) {
	                index = searchArray(arr, i - diff, elem);
	                if (index == -1) {
	                    return -1;
	                }
	            }
	            return index;
	    }
	}

}
