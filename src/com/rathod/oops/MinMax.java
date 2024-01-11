package com.rathod.oops;
//183. A programmer must create a generic class MinMax and the type parameter of
//MinMax must implement Comparable.

Which implementation of MinMax will compile?
A. class MinMax<E extends Comparable<E>> {
E min = null;
E max = null;
public MinMax() {}
public void put(E value) { /* store min or max */ }
}
B. class MinMax<E implements Comparable<E>> {
E min = null;
E max = null;
public MinMax() {}
public void put(E value) { /* store min or max */ }
}
C. class MinMax<E extends Comparable<E>> {
<E> E min = null;
<E> E max = null;
public MinMax() {}
public <E> void put(E value) { /* store min or max */ }
}
D. class MinMax<E implements Comparable<E>> {
<E> E min = null;
<E> E max = null;
public MinMax() {}
public <E> void put(E value) { /* store min or max */ }
}
Answer: A
