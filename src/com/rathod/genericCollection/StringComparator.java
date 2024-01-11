package com.rathod.genericCollection;
import java.util.*;
public class StringComparator implements Comparator  {
 public int compare(Object o1, Object o2) {
   if (o1 != null && 
       o2 != null && 
       o1 instanceof String && 
       o2 instanceof String) { 
     String s1 = (String) o1; 
     String s2 = (String) o2; 
     return - (s1.compareTo(s2));
   } else {
     return 0; 
   }
 }
  public static void main(String[] args) {
	  StringComparator sc = new StringComparator();
	  int val = sc.compare("Hi", "Hello");
	  System.out.println(val);
	    Map words = new TreeMap(new StringComparator());
	    	    <same as WordFrequency>

	  
  }
}
