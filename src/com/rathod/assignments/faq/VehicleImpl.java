package com.rathod.assignments.faq;

public abstract class VehicleImpl implements Vehicle {

	private String str;

	public VehicleImpl() {
	}

	public VehicleImpl(String str) {
		this.str = str;
	}

	public VehicleImpl(String str, String str1) {
		this.str = str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String types() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * @Override public int capacity() { // TODO Auto-generated method stub
	 * return 0; }
	 */

	public String simpleAbsMtd() {
		String str = "Abs class mtd";
		System.out.println(str);
		return str;

	}

}
