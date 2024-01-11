package com.rathod.oops;

public class InterfaceImpl implements InterfaceTwo {

	public static void main(String[] args) {
		int j = InterfaceTwo.k;
		System.out.println("Interface implntd data field k = "+j);
	}

	@Override
	public String display() {
		System.out.println("Interface implntd mtd");	
		return null;
	}

}
