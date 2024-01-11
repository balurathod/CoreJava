package com.rathod.exceptionHandling;

public class TryCatchEx {
	int result;
	public int arithMatic() {
		
		try {
			result = 2/0;
			System.out.println(result);
			return 1;
			
		} catch (Exception e) {
			//System.out.println(2);
			return 2;
		} finally {
			//System.out.println(3);
			return 3;
		}
		
	}
	
	
	public static void main(String[] args) {
		TryCatchEx tce = new TryCatchEx();
		tce.arithMatic();
	}

}
