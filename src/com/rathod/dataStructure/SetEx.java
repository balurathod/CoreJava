package com.rathod.dataStructure;
import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		Set<Short> s = new HashSet<Short>();
		for (Short i = 0; i < 100; i++) {
			s.add(i);
			s.remove(i-1);		//int valued expression
			//System.out.println(s.toString());
			//System.out.println(s.size());
		}
		System.out.println(s.size());
	}

}
