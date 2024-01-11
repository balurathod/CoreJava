package com.rathod.java5;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScannerSuppClass ssc = new ScannerSuppClass();
		System.out.println("Enter the name of first gf here :");
		String temp = sc.next();
		ssc.setGirlsName(temp);
		ssc.saying();
	}

}
