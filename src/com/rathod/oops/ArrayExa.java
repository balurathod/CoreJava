package com.rathod.oops;

public class ArrayExa {

	public static void main(String[] args) {
		System.out.println("Index\tValue");
		int array[] = {12,23,34,45,67,87,55};
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+"\t"+array[i]);
		}
	}

}
