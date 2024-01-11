package com.rathod.collection;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> qu = new ArrayBlockingQueue<Integer>(3);
		
		qu.add(11);
		qu.add(12);
		qu.add(13);
		try {
			qu.add(14);
		} catch (IllegalStateException e) {
			System.out.println("Trying to add too many items into Queue");
		}
		
		for (Integer integer : qu) {
			System.out.println("Queue value :"+integer);
		}
		
		System.out.println("Remove from Queue "+ qu.remove());
		System.out.println("Remove from Queue "+ qu.remove());
		System.out.println("Remove from Queue "+ qu.remove());
		try {
			System.out.println("Remove from Queue "+ qu.remove());
		} catch (NoSuchElementException e) {
			System.err.println(e);			
		}
		
		///////////////////////////////////////////////////////////////
		Queue<Integer> qu1 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek :"+qu1.peek());
		
		qu1.offer(111);
		qu1.offer(121);
		if(qu1.offer(131) == false);
		System.out.println("Offer failed to add third item");
		
		for (Integer integer : qu1) {
			System.out.println("ADDING Queue 2 value :"+integer);
		}
		
		System.out.println("Queue 2 poll :"+qu1.poll());
		System.out.println("Queue 2 poll :"+qu1.poll());
		System.out.println("Queue 2 poll :"+qu1.poll());
	}

}
