package com.rathod.oops;
//163. Given:
 import java.util.*;
 public class PQ {
 public static void main(String[] args) {
 PriorityQueue<String> pq = new PriorityQueue<String>();
 pq.add("carrot");
 pq.add("apple");
 pq.add("banana");
 System.out.println(pq.poll() + ":" + pq.peek());
 }
}

/*
What is the result?
A. apple:apple
B. carrot:apple
C. apple:banana
D. banana:apple
E. carrot:carrot
F. carrot:banana
Answer: C

poll()- check highest priority from list & remove it from List.

peek()- check highest priority from list & NOT remove it from List.

*/