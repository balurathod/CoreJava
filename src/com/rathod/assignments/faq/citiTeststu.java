package com.rathod.assignments.faq;

import java.util.*;
import java.util.function.*;
public class citiTeststu {
    public static void main(String[] args) {

        List<Student> lst = new ArrayList<>();
        lst.add(new Student(1, "balu", 100));
        lst.add(new Student(2, "Bala", 90));
        lst.add(new Student(3, "Vishal", 80));
        lst.add(new Student(4, "Tanuj", 100));
        lst.add(new Student(5, "Anuj", 100));

        List<Student> studenCount  = lst.stream().filter(s -> s.math.equals(100)).count().(Collectors.toList());

        
    }
}


class Student {

    int id ;
    String name;
    Integer math;

    public Student(int id, String name, int math) {
        this.id = id;
        this.name = name;
        this.math = math;


    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSunject() {
        return math;
    }
    public void setSunject(Integer math) {
        this.math = math;
    }
    
} 

//default scope of maven
//prototype scope write in singleton

