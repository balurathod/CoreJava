package com.rathod.collection.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListEx {
	/*
	 * Dynamically growing array, maintain insertion order, Allowed duplicate
	 * elements and Index base
	 */
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// by default size =10 dynamically grow by 50%.

		al.add(10);
		al.add(30);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(170);
		al.add(107);
		al.add(106);
		al.add(17);
		al.add(80);

		System.out.println("size b4 remove ele " + al.size());

		// very fast remove
		al.remove(10);
		System.out.println("size after remove ele " + al.size());

		// very slowly remove bcz chk how?
		al.remove(0);
		System.out.println("size after remove 0 ele " + al.size());
		al.remove(1);
		System.out.println("size after remove 1 ele " + al.size());

		for (Integer integer : al) {
			System.out.println("Array ele are " + integer);
		}
		System.out.println(al.remove(al.size() - 1));

		System.out.println("size after for loop remove ele " + al.size());

		List<Integer> all = new ArrayList<Integer>(20);
		all.add(13);
		System.out.println("size of all " + all.hashCode());
		System.out.println("size of all " + all.indexOf(all));
		System.out.println("size of all " + all.lastIndexOf(all));
		System.out.println("size of all " + all.get(0));
		System.out.println("size of all " + all.set(1, 1));
		System.out.println("size of all " + all.addAll(al));
		System.out.println("size of all " + all.subList(0, 5));

		Collection c = null;
		List<Integer> alc = new ArrayList<Integer>(c);
	}

}
