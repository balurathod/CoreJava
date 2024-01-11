package com.rathod.collection;
import java.util.*;  
public class AgeComparator implements Comparator{  
	public int Compare(Object o1,Object o2){  
	Student s1=(Student)o1;  
	Student s2=(Student)o2;  
	  
	if(s1.age==s2.age)  
	return 0;  
	else if(s1.age>s2.age)  
	return 1;  
	else  
	return -1;  
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}  
	}  