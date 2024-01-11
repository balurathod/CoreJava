package com.rathod.assignments;
 
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class EmployeeAge {
    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(100, "Balu", 10000, 20));
        empList.add(new Employee(101, "Kalu", 10000, 25));
        empList.add(new Employee(102, "Salu", 10000, 25));
        empList.add(new Employee(103, "Golu", 10000, 27));

        List<Employee> tempList = empList.stream()
              .filter(e -> "Balu".equalsIgnoreCase(e.getEmpName()) && e.getAge() > 19)
              .collect(Collectors.toList());
   
        tempList.forEach(e -> System.out.println("Emp Name :- " + e.getEmpName() + " , Age :- " + e.getAge()));        
    }
}

class Employee {
    long id;
    String empName;
    float salary;
    int age;

    Employee(int id, String empName, float salary, int age) {
        super();
        this.id = id;
        this.empName = empName;
        this.salary = salary;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    

}
