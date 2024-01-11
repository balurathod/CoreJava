package com.rathod.oops;
//182. Given:
 // insert code here
 private N min, max;
 public N getMin() { return min; }
 public N getMax() { return max; }
 public void add(N added) {
 if (min == null || added.doubleValue() < min.doubleValue())
 min = added;
 if (max == null || added.doubleValue() > max.doubleValue())
 max = added;
 }
}

/*
Which two, inserted at line 11, will allow the code to compile? (Choose two.)
A. public class MinMax<?> {
B. public class MinMax<? extends Number> {
C. public class MinMax<N extends Object> {
D. public class MinMax<N extends Number> {
E. public class MinMax<? extends Object> {
F. public class MinMax<N extends Integer> {
Answer: DF
*/