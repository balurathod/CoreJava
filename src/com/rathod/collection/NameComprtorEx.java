package com.rathod.collection;
import java.util.*;  
public class NameComprtorEx implements Comparator{  
	public int Compare(Object o1,Object o2){  
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
	  
	return s1.name.compareTo(s2.name);  
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}  
	}  