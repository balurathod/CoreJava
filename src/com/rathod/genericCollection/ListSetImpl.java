package com.rathod.genericCollection;
import java.util.*;
public class ListSetImpl {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(2);
		ls.add(3);
		ls.add(1);
		ls.add(2);
		ls.add(4);
		ls.add(5);
		System.out.println("list ele "+ls);
		
		Set<Integer> st = new HashSet<Integer>(ls);
		System.out.println("set ele hashCode "+st.hashCode());
		System.out.println("set ele add  "+st.add(6));
		System.out.println("set ele contains "+st.contains(7));
		System.out.println("set ele equals  "+st.equals(5));
		System.out.println("set ele getClass "+st.getClass());
		System.out.println("set ele isEmpty "+st.isEmpty());
		System.out.println("set ele remove "+st.remove(1));
		System.out.println("set ele toArray "+st.toArray());
		
		SortedSet<Integer> ss = new TreeSet<Integer>(st);
		System.out.println("sorted set ele tailSet "+ss.tailSet(3));
		System.out.println("sorted set ele headSet "+ss.headSet(3));
		System.out.println("sorted set hashCode "+ss.hashCode());
		System.out.println("sorted set first ele "+ss.first());
		System.out.println("sorted set last  ele "+ss.last());
		
		TreeSet<Integer> ts = new TreeSet<Integer>(ss);
		System.out.println("Tree set ele "+ts);
		
	}
}
