package com.rathod.oops;

import java.io.*;

class StringRotate {

	public static void main(String[] args) {

		String inpstring = "";
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);

		try {
			System.out.println("Enter a string to rotate:");
			inpstring = reader.readLine();
			int len = inpstring.length();
			//int lastindex = len - 1;
			char[] outstring = inpstring.toCharArray();
			for (int i = 0; i < len; i++) {
				char ch = outstring[0];
				for (int j = 0; j < len - 1; j++) {
					outstring[j] = outstring[j + 1];
				}
				outstring[len - 1] = ch;

				for (int k = 0; k < outstring.length; k++)
					System.out.print(outstring[k]);
					System.out.println();

			}
			System.out.println();
			System.out.println();

		/*	for (int i = 0; i < len; i++) {
				char ch = outstring[len - 1];
				for (int j = len - 1; j > 0; j--) {
					outstring[j] = outstring[j - 1];
				}
				outstring[0] = ch;
				for (int k = 0; k < outstring.length; k++)
					System.out.print(outstring[k]);
				System.out.println();
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}