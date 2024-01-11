package com.rathod.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListEx {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>(); //[0][2][1][3][4][5][6][7][8][].... by default size 
		List<Integer> ll = new LinkedList<Integer>(); //[0]->[2]->[1]->[3]->[4]->[5]->[6]->[7]->[8][].... =10 dynamically
													 //    <-   <-   <-   <-   <-   <-   <-
														// grow by 50.
														// al.add(10);
		// al.add(20);
		// al.add(30);

		doTiming("ArrrayList", al);
		doTiming("LinkedList", ll);

	}

	private static void doTiming(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		// Add items at end of list
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		// Add items else where in list
		for (int i = 0; i < 1E5; i++) {
			//list.add(0,i);// add at the end of list
			list.add(list.size(),i);//adding ele rt to the  end , picking default array size.
			//list.add(list.size() - 100,i);//adding ele rt to the  end
			
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken : "+(end - start)+"ms for "+type);
	}
}
