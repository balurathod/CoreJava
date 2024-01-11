package com.rathod.genericCollection;
import java.util.*;  
public class TestCollection {
	 public static void main(String args[]){  
	   
	  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
	  al.add("Ravi");//adding object in arraylist  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  ArrayList all=new ArrayList();  
	  all.add(Integer.valueOf(201));  
	  all.add(Integer.valueOf(101));  
	  all.add(230);//internally will be converted into objects as Integer.valueOf(230)  
	  
	  Collections.sort(al);  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	  System.out.println(itr.next());  
	   }  
	  
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Sonoo");  
	  al2.add("Hanumat");  
	    
	  LinkedList<String> ll=new LinkedList<String>();  
	  ll.add("Ravi");  
	  ll.add("Vijay");  
	  ll.add("Ravi");  
	  ll.add("Ajay");  
	  
	  al.addAll(al2);    
	  al.retainAll(al2);  
	  al.removeAll(al2);  

	  Iterator itr5=al.iterator();//getting Iterator from arraylist to traverse elements  
	  while(itr5.hasNext()){      						//first way of iterator
	   System.out.println(itr5.next());  
	  }
	//for(String obj:al)   System.out.println(obj);  //second way of iterator
	  
	  System.out.println("element at 2nd position: "+al.get(2));  	  
	  ListIterator<String> itr3=al.listIterator();  	    
	  System.out.println("traversing elements in forward direction...");  
	  while(itr3.hasNext()){  
	  System.out.println(itr3.next());  
	   }  	    
	    
	  System.out.println("traversing elements in backward direction...");  
	  while(itr3.hasPrevious()){  
	  System.out.println(itr3.previous());  
	  
	  
	  Iterator<String> itr1=ll.iterator();  
	  while(itr1.hasNext()){  
	   System.out.println(itr1.next());  
	 } 
	  
	  
	  List<String> la=new ArrayList<String>();//creating arraylist    
	  la.add("Ravi");//adding object in arraylist    
	  la.add("Vijay");    
	  la.add("Ravi");    
	  la.add("Ajay");    
	    
	  List<String> al3=new LinkedList<String>();//creating linkedlist    
	  al3.add("James");//adding object in linkedlist    
	  al3.add("Serena");    
	  al3.add("Swati");    
	  al3.add("Junaid");    
	    
	  System.out.println("arraylist: "+la);  
	  System.out.println("linkedlist: "+al3);  
	  
	  
	 }
 } 
}
	  