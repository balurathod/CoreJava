package com.rathod.oops;

public class MtdOverload {

	public MtdOverload(double d[]) {// 12.6
		System.out.println(" MtdOvrld constr");
	}

	public MtdOverload(Object o) {
		System.out.println("MtdOvrld1 constr1");
	}

	public static void main(String[] args) {
		new MtdOverload(null);

	}

}
