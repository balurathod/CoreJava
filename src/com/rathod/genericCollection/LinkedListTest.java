package com.rathod.genericCollection;
import java.util.*;
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(5);
		ll.add(50);
		ll.add(500);
		ll.add(5000);
		ll.add(50000);
		ll.add(6000);
		ll.add(600);
		System.out.println(ll.isEmpty());
		System.out.println("All list elm "+ll);
		System.out.println("Remove first elm "+ll.removeFirst());
		System.out.println("Remove last elm "+ll.removeLast());
		ll.addFirst(21);
		ll.addLast(32);
		System.out.println(ll);
		System.out.println("contains "+ll.contains(500));
		ll.peek();
		System.out.println("peek all elem "+ll);
		ll.poll();
		System.out.println("poll Remove first & Show remaining "+ll);
		ll.lastIndexOf(500);
		System.out.println("lastIndexOf "+ll);
		ll.offer(80);
		System.out.println("offer add elem at end by default  "+ll);
		ll.offerFirst(7000);
		System.out.println("offerFirst add elem at first "+ll);
		ll.offerLast(60);
		System.out.println("offerLast add elem at end "+ll);
		ll.clear();
		System.out.println("Clear list "+ll);
	}

}
