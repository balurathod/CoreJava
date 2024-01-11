package com.rathod.assignments.faq;

import java.util.*;

public class HashMapEx {
	HashMap map=new HashMap();

	public HashMapEx() {
		map.put("2", "modi");
		map.put("4", "sodi");
		map.put("5", "godi");
		System.out.println(map);
		
	}
	public void mtd() {

		map.put("1", "indhu");
		map.put("d", "bindhu");
		map.put("3", "swathi");
		 
		if(!map.isEmpty()){
		 
			Iterator it=map.entrySet().iterator();			 
			while(it.hasNext()){		 
				Map.Entry obj=(Entry) it.next();
				System.out.println(obj.getValue());		 
			}			 
		}		

	}
	public static void main(String[] args) {
		 
		HashMapEx he = new HashMapEx();
		he.mtd();
		System.out.println("dfdfd");
	}		 
}
