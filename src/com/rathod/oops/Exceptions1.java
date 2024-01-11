package com.rathod.oops;

public class Exceptions {
	public static void main(String[] args) {
		int A[] = {1,2,3,4};
		System.out.println("Hello....");
		try {
		//System.out.println(10/0);
		System.out.println(A[5]);
		}
		catch(Exception e)     
		{
			e.printStackTrace();
		}
		
	}
}
