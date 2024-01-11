package com.rathod.collection.map;

import java.util.HashMap;
// import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEmpEx {
	
	public static void main(String[] args) {
		
		Map<Integer, Employee> hashMap = new HashMap<>(10, 0.75F);
		
		Employee emp1 = new Employee(101, "Balu1");
		Employee emp2 = new Employee(102, "Balu2");
		Employee emp3 = new Employee(103, "Balu3");
		Employee emp4 = new Employee(104, "Balu4");
		
		hashMap.put(emp1.getId(), emp1);
		hashMap.put(emp2.getId(), emp2);
		hashMap.put(emp3.getId(), emp3);
		hashMap.put(emp4.getId(), emp4);
		
		/*
		@SuppressWarnings("unchecked")
		Iterator<Entry<Integer, Employee>> itr= ((Set<Entry<Integer, Employee>>) hashMap).iterator();  
		while(itr.hasNext()){  
		   System.out.println("Using while "+itr.next()); 
	    }
	    
	    Exception in thread "main" java.lang.ClassCastException: java.util.HashMap cannot be cast to java.util.Set
	    at com.rathod.collection.HashMapEmpEx.main(HashMapEmpEx.java:26)
 
		*/
		
		Set<Map.Entry<Integer, Employee>> entries = hashMap.entrySet();
		
		for (Entry<Integer, Employee> entry : entries) {
			
			System.out.println("Getting keys "+entry.getKey());
			Employee employee = entry.getValue(); 
			employee.display();
		}
		
	}

}
