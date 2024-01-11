package com.rathod.collection.array;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add(3.5);
		al.add(55);
		al.add(new ArrayListTest());
		
		for(Object obj : al){
			System.out.println("ArrayList "+obj);			
		}
		
		//Using Generics
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Java");
		al1.add("Core");
		al1.add("SERVLET");
		al1.add("JSP");
		al1.add("JSTL");
		al1.add("CSS");
		System.out.println("ArrayList not sorted "+al1);
		al1.set(1, "JDBC");//replacing 
		System.out.println("ArrayList after replace "+al1);
		System.out.format("There are %d elements in the collection", al1.size());
		System.out.println();
		al1.remove(1);
		System.out.println("get 4th elm "+al1.get(3));
		System.out.println("************************");
		
		Iterator<String> it = al1.iterator();
		while(it.hasNext()){			
			System.out.println("get all generic elm "+it.next());			
		}
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Java6");
		al2.add(0,"Core6");
		al2.add(1,"SERVLET2.5");
		al2.add("JSP2.0");
		al2.add("JSTL1.3");
		al2.add("spEl");
		System.out.println("ArrayList not sorted "+al2);
		System.out.println(al2.isEmpty());
		System.out.println(al2.contains("Java6"));
		System.out.println(al2.contains("Java5"));
		System.out.println(al2.indexOf("Java6"));
		System.out.println(al2.subList(1,4));
				
		al2 = al1;
		System.out.println("ArrayList al1 "+al1);
		System.out.println("Removed from ArrayList al1 "+al1.remove(1));
		System.out.println("ArrayList al1 "+al1);
		System.out.println("size of ArrayList al2 "+al2.size());
		System.out.println("ArrayList al2 "+al2);
		
		//how to sort arraylist
		al1.sort(arg0);
	}
}
