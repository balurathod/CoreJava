package com.rathod.assignments.faq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MultipleInheritanceImpl implements MultipleInheritanc,
		MultipleInheritanc1 {

	public static void main(String[] args) {
		MultipleInheritanceImpl m = new MultipleInheritanceImpl();
		MultipleInheritanc.super.add();
		MultipleInheritanc1.super.add();
		m.Sub();
		m.Multi();
		System.out.println(m.tryFinally());
		new HashSet();
	}

	@Override
	public void Multi() {
		int a = 10, b = 25, result;
		result = a * b;
		System.out.println("Multi : " + result);
	}

	@Override
	public void add() {
		int a = 10, b = 25, result;
		result = a + b;
		System.out.println("Add : " + result);
	}

	@Override
	public void Sub() {
		int a = 10, b = 25, result;
		result = a - b;
		System.out.println("Sub : " + result);

	}

	public boolean tryFinally() {
		Map<String, String> mm = new HashMap<String, String>();
		mm.put("Animal", "Loin");
		mm.put("Animal", "Loin1");
		System.out.println(mm.size());

		try {
			return true;
		} finally {
			return false;
		}
	}

}
