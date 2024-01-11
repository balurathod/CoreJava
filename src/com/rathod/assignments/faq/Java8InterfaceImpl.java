package com.rathod.assignments.faq;

public class Java8InterfaceImpl implements Java8Interface, Java8Interface1 {

	public static void main(String[] args) {
		System.out.println("Hello");
		Java8InterfaceImpl jii = new Java8InterfaceImpl();
		jii.show();
		jii.square(3);
	}

	@Override
	public void square(int a) {
		int result = a*a;
		System.out.println(result);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Java8Interface.super.show();
		Java8Interface1.super.show();
	}
	
}
