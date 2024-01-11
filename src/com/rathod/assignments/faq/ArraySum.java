package com.rathod.assignments.faq;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(4);
		al.add(2);

		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			for (int j = 1; j < al.size(); j++) {
				sum = al.get(i) + al.get(j);
				if (sum == 5)
					System.out.println("sum => " + al.get(i) + "+" + al.get(j)
							+ " = " + sum);
			}
		}
	}

}
