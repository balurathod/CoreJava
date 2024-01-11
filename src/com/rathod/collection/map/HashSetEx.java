package com.rathod.collection.map;
import java.util.*;
public class HashSetEx {
	public static void main(String args[]){
	//HashSet<String> al=new HashSet<String>(); 
	TreeSet<String> al=new TreeSet<String>();  

	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next()); 
	  }
	  
	  LinkedHashSet<String> hl=new LinkedHashSet<String>();  
	  hl.add("Ravi");  
	  hl.add("Vijay");  
	  hl.add("Ravi");  
	  hl.add("Ajay");  
	  
	  Iterator<String> itr1=hl.iterator();  
	  while(itr1.hasNext()){  
	   System.out.println(itr1.next()); 
	}
	
	  PriorityQueue<String> queue=new PriorityQueue<String>();  
	  queue.add("Amit");  
	  queue.add("Vijay");  
	  queue.add("Karan");  
	  queue.add("Jai");  
	  queue.add("Rahul");  
	    
	  System.out.println("head:"+queue.element());  
	  System.out.println("head:"+queue.peek());  
	    
	  System.out.println("iterating the queue elements:");  
	  Iterator itr2=queue.iterator();  
	  while(itr2.hasNext()){  
	  System.out.println(itr2.next());  
	  }  
	    
	  queue.remove();  
	  queue.poll();  
	    
	  System.out.println("after removing two elements:");  
	  Iterator<String> itr3=queue.iterator();  
	  while(itr3.hasNext()){  
	  System.out.println(itr3.next());  
	  }  
	  
	  HashMap<Integer,String> hm=new HashMap<Integer,String>();  	  
	  hm.put(100,"Amit");  
	  hm.put(101,"Vijay");  
	  hm.put(102,"Rahul");  
	  
	  for(Map.Entry m:hm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	    
	  
	  //LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
	  //TreeMap<Integer,String> lhm=new TreeMap<Integer,String>();  
	  Hashtable<Integer,String> lhm=new Hashtable<Integer,String>();  
	  
	  lhm.put(100,"Amit");  
	  lhm.put(101,"Vijay");  
	  lhm.put(102,"Rahul");  
	  
	for(Map.Entry m:lhm.entrySet()){  
	   System.out.println(m.getKey()+" "+m.getValue());  
	  }  
	  
}
}