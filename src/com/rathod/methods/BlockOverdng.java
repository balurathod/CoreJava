package com.rathod.methods;

public class BlockOverdng {
	
	{
		System.out.println("Hello Non Static Block");
	}
	
	static {
		System.out.println("Hello Static Block");
	}
	
	BlockOverdng () {
		System.out.println("Hello Constructor Block");
	}

	public static void main(String[] args) {
		
		new BlockOverdng();

	}

}
