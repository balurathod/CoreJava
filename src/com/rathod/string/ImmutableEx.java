package com.rathod.string;

public final class ImmutableEx {
	final String name;
	final int regNo;

	public ImmutableEx(String name, int regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableEx s = new ImmutableEx("ABC", 101);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());

		// Uncommenting below line causes error
		//s.regNo = 102; 	//The final field ImmutableEx.regNo cannot be assigned
	}

}
