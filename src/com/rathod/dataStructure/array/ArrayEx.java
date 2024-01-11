package com.rathod.dataStructure.array;

public class ArrayEx {

	public static void main(String[] args) {
		// int[] i = { 1, 2, 3, 4, 5, 6 };
		// /int [] i = { 1, 2, 3, 4, 5, 6 };
		int i[] = { 1, 2, 3, 4, 5, 6 };
		int k[][] = { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } };
		System.out.println("Array ref val " + k);
		for (int j = 0; j < i.length; j++) {
			System.out.println("Array index val " + j);
		}
		System.out.println("Array index 0 val " + i[0]);
		System.out.println("Array index 3 val " + i[3]);
		System.out.println("Array hashcode val " + i.hashCode());
		System.out.println("Array toString val " + i.toString());
		try {
			System.out.println("Array[] try 0 val " + i[10]);
			System.out.println("Array[][] try 1 val " + k[2][5]);
		}/*
		 * catch (Exception e) { e.printStackTrace(); }
		 */
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("getCause " + e.getCause());
			System.out.println("getMessage " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Array class val " + i.getClass());
		System.out.println("Array length val " + i.length);
		int m[] = i.clone();
		System.out.println("Array clone length val " + m.length);
		System.out.println("Array clone length val " + m[0]);

		for (int l = 0; l < k.length; l++) {
			System.out.println("Array index val " + l);
		}
		System.out.println("Array[][] index 0 val " + k[3][0]);
		System.out.println("Array[][] index 0 val " + k[3][1]);
		System.out.println("Array[][] index 3 val " + k[2][1]);

		String str[] = { "Balu", "Sudha", "Tanuj", "Aai" };
		for (String s : str) {
			System.out.println("Array str val " + s);
		}
		System.out.println("Array str 0 val " + str[3]);
		System.out.println("Array str val " + str[1]);
		System.out.println("Array str lngt " + str.length);
		System.out.println("Array str lngt " + str.hashCode());

	}
}
