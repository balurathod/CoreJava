package com.rathod.java7;

//Java program to illustrate cleaning of  
// resources before Java 7 

import java.io.*;

public class TryWithoutResource {
	public static void main(String args[]) {
		BufferedReader br = null;
		String str = " ";

		System.out.println("Enter the file path");//D:\Workspace2019\CoreJava\dataFiles\MyName.txt
		br = new BufferedReader(new InputStreamReader(System.in));

		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			String s;

			// file resource
			br = new BufferedReader(new FileReader(str));

			while ((s = br.readLine()) != null) {
				// print all the lines in the text file
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (br != null)

					// closing the resource in 'finally' block
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}