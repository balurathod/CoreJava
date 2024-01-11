package com.rathod.collection;
import java.util.*;

import com.rathod.collection.map.Employee;
public class SetTest {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();
        uniques.add("A");
        uniques.add("A");
        uniques.add("b");
        uniques.add("B");
        uniques.add("C");
        uniques.add("D");
        
        dups.add("A");
        dups.add("a");
        dups.add("B");
        dups.add("c");
        dups.add("C");
        
        	for (String a : uniques)
            if (!uniques.add(a))
                dups.add(a);

        // Destructive set-difference
        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
        
        //User defined object
        Employee emp1 = new Employee(100, "Balu", 1200.56);
        Employee emp2 = new Employee(100, "Balu", 1200.56);
        Employee emp3 = new Employee(100, "Balu", 1200.56);
        
        
        Set<Employee> semp = new HashSet<>();
        
        semp.add(emp1);
        semp.add(emp2);
        semp.add(emp3);
        System.out.println(semp.size());
        
        for(Employee e : semp){
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
        }
        
    }
}