package com.rathod.assignments;

import java.util.Arrays;
//import java.util.IntSummaryStatistics;
// import Arrays class to use inbuilt sum() method

class SumofArrayEle {

    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return arr[n];
        }
        return arr[n] + sumArray(arr, n-1);
    }

	public static void main (String[] args) {
		int [] nums = {1,2,3,4,5};
        int sum = 0;
        //b4 java 8
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);


        //Java8
		sum = Arrays.stream(nums).sum();
        sum = Arrays.stream(nums).reduce((x, y) -> x + y).getAsInt();
        sum = Arrays.stream(nums).reduce(Integer::sum).getAsInt();
        //sum = Arrays.stream(nums).summaryStatistics().getSum();
		System.out.println(sum);


        //recursive
        int n = nums.length;
        System.out.println(SumofArrayEle.sumArray(nums, n-1));
	}
}
