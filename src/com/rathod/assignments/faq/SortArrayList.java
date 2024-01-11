package com.rathod.assignments.faq;
import java.util.*;
public class SortArrayList {
	  public static void main(String[] args) {
		  
          //create an ArrayList object
          ArrayList arrayList = new ArrayList();

          //Add elements to Arraylist
          arrayList.add(1);
          arrayList.add(2);
          arrayList.add(3);
          arrayList.add(4);
          arrayList.add(5);
          arrayList.add(6);

          /*Use static Comparator reverseOrder() method of Collections 
      		utility class to get comparator object
         */

          Comparator comparator = Collections.reverseOrder();
       	  System.out.println("Before sorting  : "  + arrayList);      

         //use static void sort(List list, Comparator com) method of Collections class.
          
          Collections.sort(arrayList,comparator);
          System.out.println("After sorting in reverse Order : "+ arrayList);

     }
}