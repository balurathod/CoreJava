package com.rathod.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		/* HashMapTest ht = new HashMapTest();
		hm.put("In", "India");
		hm.put("End", "England");
		hm.put("Po", "Portugal");
		hm.put("Jn", "Jarmany");
		hm.put("JP", "Japan");
		hm.put("UK", "London");
		// hm.put(ht, "ref");

		Map m = new HashMap();
		m.put(ht, "dff");
		m.put(new HashMapTest(), "dffdf");

		System.out.println("hash map " + m);
		System.out.println("hash map get " + m.get(ht));
		System.out.println("hash map list " + hm);
		System.out.println("hash map hascode " + hm.hashCode());
		System.out.println("hash map get " + hm.get("Jn"));
		System.out.println("hash map put " + hm.put("Fr", "France"));

		hm.put("UK", "Paris");
		System.out.println("Value of UK =" + hm.get("UK"));
		System.out.println("To get size : " + hm.size());
		System.out.println("To remove : " + hm.remove("JP"));
		System.out.println("To get size : " + hm.size());

		for (String key : hm.keySet()) {
			System.out.println("To get keys : " + key);
		}

		// Whats wrong here? I changed the value of String s right before
		// Iterating the HashMap and it still shows the old value. That shows to
		// me that HashMap DOES NOT work with object reference?
		final HashMap<Integer, String> tests = new HashMap<>();

		String s = "String";
		tests.put(1, s);
		tests.put(2, "2");
		tests.put(3, "3");
		s = "1";
		for (Integer i : tests.keySet()) {
			System.out.println("Key: " + i + ", Value: " + tests.get(i));
		}
		*/
		
		hm.put("s1", "value1");
		hm.put("s2", "value2");
		hm.put("s3", "value3");
		hm.put("s4", "value4");
		System.out.println("size of hm "+hm.size());
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("s1", "value1");
		hm1.put("s2", "value2");
		hm1.put("s3", "value3");
		hm = hm1;
		hm.remove("s2");
		System.out.println("size of hm "+hm);
		System.out.println("size of hm "+hm.size());
		System.out.println("size of hm1 "+hm1.size());

	}
}
