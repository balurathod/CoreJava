package com.rathod.oops;

public class FinalEx {

	private int sum;
	private final int NUMBERS;
	
	FinalEx(int x ){
		NUMBERS = x;
		System.out.println(NUMBERS);
	}
	
	public void add(){
		sum+=NUMBERS;
	}
	
	public String toString(){
		return String.format("Sum = %d\n", sum);
	}
	
	public static void main(String[] args) {
		
		FinalEx fe = new FinalEx(10);
		for (int i = 0; i < 5; i++) {
			fe.add();
			System.out.printf("%s" , fe);
			//fe.NUMBERS = 15;			//not allow
		}
		
	}

}
