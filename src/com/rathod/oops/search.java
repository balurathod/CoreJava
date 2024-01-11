package com.rathod.oops;
//187. Given:
 public static void search(List<String> list) {
 list.clear();
 list.add("b");
 list.add("a");
 list.add("c");
 System.out.println(Collections.binarySearch(list, "a"));
}
/*
What is the result of calling search with a valid List implementation?
A. 0    B. 1     C. 2     D. a    E. b      F. c
G. The result is undefined.
 Answer: G

*/