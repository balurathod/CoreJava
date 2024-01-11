package com.rathod.collection;
import java.util.*;  
import java.io.*;
public class SimpleEx {  
	public static void main(String args[]){  
	  
	ArrayList al=new ArrayList();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	  
	System.out.println("Sorting by Name...");  
	  
	Collections.sort(al,new NameComprtorEx());  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	Student st=(Student)itr.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
	System.out.println("sorting by age...");  
	  
	Collections.sort(al,new AgeComparator());  
	Iterator itr2=al.iterator();  
	while(itr2.hasNext()){  
	Student st=(Student)itr2.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
	 
	 List<String> all=new ArrayList<String>();//creating arraylist    
	  all.add("Sonoo");//adding object in arraylist    
	  all.add("Michael");    
	  all.add("James");    
	  all.add("Andy");    
	  //traversing elements using Iterator  
	  Iterator itr3=all.iterator();  
	  while(itr3.hasNext()){  
	   System.out.println(itr3.next());  
	  }    
	  
	  
	  Vector<String> v=new Vector<String>();//creating vector  
	  v.add("umesh");//method of Collection  
	  v.addElement("irfan");//method of Vector  
	  v.addElement("kumar");  
	  //traversing elements using Enumeration  
	  Enumeration e=v.elements();  
	  while(e.hasMoreElements()){  
	   System.out.println(e.nextElement());  
	  }  
	}  
	}  