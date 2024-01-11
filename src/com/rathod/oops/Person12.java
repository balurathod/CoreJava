package com.rathod.oops;
//168. Given:     
public class Person12 
{
		 private String name, comment;
		 private int age;
		 public Person12(String n, int a, String c)
			 {
		 		 name = n;
				 age = a;
				 comment = c;     
	         } 
	     public boolean equals(Object o)
		 {
			 if (! (o instanceof Person12))
				 return false;
			     Person12 p = (Person12)o;
			     return age == p.age && name.equals(p.name);     
		 }  
 }


 /*
What is the appropriate definition of the hashCode method in class Person?
A. return super.hashCode();
B. return name.hashCode() + age * 7;
C. return name.hashCode() + comment.hashCode() / 2;
D. return name.hashCode() + comment.hashCode() / 2 - age * 3;     
Answer: B

*/