package com.rathod.assignments.faq;

import java.util.Comparator;

public class MyEmpCom implements Comparator<Employee>
	{ 	 
	 @Override
	 public int compare(Employee e1, Employee e2) {	 
        if(e1.getName() < e2.getName()){
            return 1;
        } else {
            return -1;
        }	 
	}	 
}

