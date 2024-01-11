package com.rathod.assignments.faq;

public class VehicleAbsImpl extends VehicleImpl {

	public VehicleAbsImpl(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}

	public VehicleAbsImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String simpleMtd() {
		String str = "AbsImpl class mtd";
		System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		VehicleImpl vi = new VehicleAbsImpl();
		VehicleAbsImpl avi = new VehicleAbsImpl();
		vi.capacity();
		avi.simpleMtd();
		vi.simpleAbsMtd();
	}

}
