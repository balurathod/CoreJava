package com.rathod.assignments.faq;
import java.util.*;
public class Main {

	public static void main(String args[]){  
	 
		ArrayList al=new ArrayList();  
		 
		al.add(new Employee(101,"Indhu"));  
		al.add(new Employee(106,"Sindhu"));  
		al.add(new Employee(105,"Swathi"));
		  
		Collections.sort(al,MyEmpCom );  
		 
		Iterator itr=al.iterator();  
		 
		while(itr.hasNext()){   		 
			Employee st=(Employee)itr.next();  
			System.out.println(st.id +" "+st.name ); 		 
	  }	  
	}
}
