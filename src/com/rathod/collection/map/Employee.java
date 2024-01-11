package com.rathod.collection.map;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Emp Id "+getId()+" Emp Name"+getName());
	}
	
	public boolean equals(Employee e){
        return name.equals(e.name);
    }

    public int hashCode(){
        return id;
    }


}
