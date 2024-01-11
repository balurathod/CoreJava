package com.rathod.oops;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("name", "shyama");
		map.put("address", "pune");
		map.put("address1", "pune");
		map.put(null, "pune1");
		map.put(null, "pune2");
		map.put("location", null);
		map.put("location1", null);
		System.out.println("map value " + map);

		Map<Object, Object> map2 = new Hashtable<Object, Object>();
		map2.put("id", 1);
		map2.put("name", "shyama");
		map2.put("address", "pune");
		map2.put("address1", "pune");
		// map2.put(null, "pune1");
		// map2.put(null, "pune2");
		// map2.put("location", null);
		// map2.put("location1", null);
		System.out.println("map value " + map2);

		Map<Object, Object> map3 = new LinkedHashMap<Object, Object>();
		map3.put("id", 1);
		map3.put("name", "shyama");
		map3.put("address", "pune");
		map3.put("address", "pune1");
		map3.put(null, "pune1");
		map3.put(null, "pune2");
		map3.put("location", null);
		map3.put("location1", null);
		System.out.println("map3 value " + map3);

		Map<Object, Object> map1 = new TreeMap<Object, Object>();
		map1.put("id", 1);
		map1.put("name", "shyama");
		map1.put("address", "pune");
		map1.put("address", "pune1");
		// map1.put(null, "pune1");
		// map1.put(null, "pune2");
		// map1.put("location", null);
		map1.put("location1", null);
		System.out.println("map1 value " + map1);

		Set<Object> objects = map1.keySet();
		Iterator<Object> iterator = objects.iterator();
		while (iterator.hasNext()) {
			Object o = iterator.next();
			String key = o.toString();

			Object o1 = map1.get(key);
			String value = null;
			if (o1 != null) {
				value = o1.toString();
			} else {
				value = null;
			}
			System.out.println("key 1 " + key + "::::::value " + value);
		}
	}
}
