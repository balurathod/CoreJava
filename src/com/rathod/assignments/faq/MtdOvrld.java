package com.rathod.assignments.faq;

public class MtdOvrld {

	public String mtd(String str) {
		System.out.println("mtd str");
		return null;
	}

	public String mtd(int i) {
		System.out.println("mtd int ");
		return null;
	}

	public static void main(String[] args) {
		MtdOvrld mo = new MtdOvrld();
		mo.mtd(87);
	}

}
