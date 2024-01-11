package com.rathod.assignments.faq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinMaxValueArrayListExample {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		
		al.add(23);
		al.add(26);
		al.add(53);
		al.add(83);
		al.add(3);
		
		System.out.println("ArrayList Max Value: " +Collections.max(al) + " index is "+ al.indexOf(Collections.max(al)));
		System.out.println("ArrayList Min Value: " +Collections.min(al) + " index is "+ al.indexOf(Collections.min(al)));
	}

}
