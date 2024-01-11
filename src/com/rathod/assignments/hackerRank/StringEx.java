package com.rathod.assignments.hackerRank;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================");// HOW TO PASS 3 LINES OF
														// INPUT?
		String[] input = new String[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < 3; i++) {
			input[i] = sc.nextLine();
		}
		for (String string : input) {
			// String s1 = sc.next();
			// int x = sc.nextInt();

			System.out.println(string + "   ");

		}

		System.out.println("=======================");

	}

}
