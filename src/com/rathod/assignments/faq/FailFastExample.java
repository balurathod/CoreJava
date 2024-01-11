package com.rathod.assignments.faq;

// Java code to illustrate 
// Fail Fast Iterator in Java 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastExample {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
		}
	}
}

/*
Output:

India

Exception in thread"main"
java.util.ConcurrentModificationException
	    at java.util.HashMap$HashIterator.nextNode(HashMap.java:1442)
at java.util.HashMap$KeyIterator.next(HashMap.java:1466)
at FailFastExample.main(FailFastExample.java:18)




// Java code to demonstrate remove 
// case in Fail-fast iterators 
  
import java.util.ArrayList; 
import java.util.Iterator; 
  
public class FailFastExample { 
    public static void main(String[] args) 
    { 
        ArrayList<Integer> al = new ArrayList<>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(4); 
        al.add(5); 
  
        Iterator<Integer> itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 2) { 
                // will not throw Exception 
                itr.remove(); 
            } 
        } 
  
        System.out.println(al); 
  
        itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 3) { 
                // will throw Exception on 
                // next call of next() method 
                al.remove(3); 
            } 
        } 
    } 
} 
Output :

[1, 3, 4, 5]
Exception in thread "main" java.util.ConcurrentModificationException
    at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
    at java.util.ArrayList$Itr.next(ArrayList.java:851)
    at FailFastExample.main(FailFastExample.java:28)


*/