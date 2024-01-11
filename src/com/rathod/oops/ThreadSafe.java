package com.rathod.oops;
import java.util.*;
public class ThreadSafe 
{
	private List names = Collections.synchronizedList(new LinkedList());

	public void add(String name)
	{
		names.add(name);
	}
	public String removeFirst()
	{
		if (names.size() > 0)
		return (String) names.remove(0);
		else
			return null;
	}
	public static void main(String[] args) 
	{
		final ThreadSafe ts = new ThreadSafe();
		ts.add("ARUN");

	}
}
class NameDropper extends Thread
			{
			public void run()
				{
				   String name = removeFirst();
				   System.out.println(name);
    		    }
   NameDropper nd = new NameDropper();
   Thread t2 = new Thread(nd);
      t2.start();
	  //t2.start();
 }

 /*
 why err at 33 & 34 ln?

 LEGAL METHODS op COLLECTIONS class  from API


synchronizedList(new LinkedList()); legal method of Collections class


 
 synchronizedCollection(Collection<T> c) 
          Returns a synchronized (thread-safe) collection backed by the specified collection. 


static <T> List<T> 
 synchronizedList(List<T> list) 
          Returns a synchronized (thread-safe) list backed by the specified list. 


static <K,V> Map<K,V> 
 synchronizedMap(Map<K,V> m) 
          Returns a synchronized (thread-safe) map backed by the specified map. 


static <T> Set<T> 
 synchronizedSet(Set<T> s) 
          Returns a synchronized (thread-safe) set backed by the specified set. 


static <K,V> SortedMap<K,V> 
 synchronizedSortedMap(SortedMap<K,V> m) 
          Returns a synchronized (thread-safe) sorted map backed by the specified sorted map. 


static <T> SortedSet<T> 
 synchronizedSortedSet(SortedSet<T> s) 
          Returns a synchronized (thread-safe) sorted set backed by the specified sorted set. 



 */