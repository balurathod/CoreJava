package com.rathod.unsolved;
class  Test29
{
	public static void main(String[] args) 
	{
		Integer a=new Integer(8);
		Integer b=new Integer(4);
		Integer c=new Integer(4);
		Vector  vec=new Vector();
      	iterator itr;

		vec.add(a);
		vec.add(b);
		vec.add(c);
       
		  itr=vec.iterator();
		  while (itr.hasNext())
		  {
              System.out.println(""+itr.next());
		  }
	}
}
/*
D:\SCJP\Oldscjp(1-5)\Exam2>javac Test29.java
Test29.java:8: cannot find symbol
symbol  : class Vector
location: class Test29
                Vector  vec=new Vector();
                ^
Test29.java:8: cannot find symbol
symbol  : class Vector
location: class Test29
                Vector  vec=new Vector();
                                ^
Test29.java:9: cannot find symbol
symbol  : class iterator
location: class Test29
        iterator itr;
        ^
3 errors



TRUE st..(CORE API)

->Hash Table is a sub class of Dictionary.

->Stack is  a sub class of Vector.

->ArrayList is not a sublclass of Vector.

->LinkList is not a subclass of ArrayList

->HashSet extends AbstractSet

->TreeSet extends AbstractSet

->LinkList NOT extends List

->LinkList extends AbstractSequentialList

->AbstractSet NOT extends Set      &  AbstractSet extends AbstractCollection

->AbstractList extends AbstractCollection

->AbstractSequentialList extends AbstractList

->WeakHashMap NOT extends HashMap

->A HashSet does not permit duplicates.

->A Vector & Set permits duplicates.

->Vector extends AbstractList

->A TreeSet is an ordered Set.

->Set is not ordered

->A LinkList is sorted in Descending & Ascending order.

->A Weak HashMap is not synchronized.


*/