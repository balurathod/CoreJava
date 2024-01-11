package com.rathod.collection;
	class Student   implements Comparable {  
		  int rollno;  
		  String name;  
		  int age;  
		  Student(int rollno,String name,int age){  
		   this.rollno=rollno;  
		   this.name=name;  
		   this.age=age;  
		  }  
		  
		  public int compareTo(Object obj){  
		  Student st=(Student)obj;  
		  if(age==st.age)  
		  return 0;  
		  else if(age>st.age)  
		  return 1;  
		  else  
		  return -1;  
		  }  
		}  