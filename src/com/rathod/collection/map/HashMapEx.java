package com.rathod.collection.map;

import java.util.HashMap;

public class HashMapEx {
	String name;
	int age;

	public HashMapEx(String name, int age) {
		// super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("__hash__");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("__eq__");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapEx other = (HashMapEx) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		HashMapEx S1 = new HashMapEx("taj", 22);
		// HashMapEx S2 = new HashMapEx("taj", 21);
		HashMapEx S2 = new HashMapEx("taj", 22);

		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());

		HashMap<HashMapEx, String> HM = new HashMap<HashMapEx, String>();
		HM.put(S1, "taj1");
		HM.put(S2, "taj1");
		System.out.println(HM.size());
		
		System.out.println(1 << 4);		//16 power of two	<< (Signed right shift)
		
		System.out.println(1 << 6);		//64 power of two	>>> (Unsigned right shift)
		
		System.out.println(4 >>> 1);
		
	}

}
