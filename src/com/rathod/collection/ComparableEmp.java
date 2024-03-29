package com.rathod.collection;

public class ComparableEmp implements Comparable<ComparableEmp> {

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getSalary() {
		return salary;
	}

	public ComparableEmp(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(ComparableEmp emp) {
		// let's sort the employee based on id in ascending order
		// returns a negative integer, zero, or a positive integer as this
		// employee id
		// is less than, equal to, or greater than the specified object.
		return (this.id - emp.id);
	}

	@Override
	// this is required to print the user friendly information about the
	// Employee
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age
				+ ", salary=" + this.salary + "]";
	}

	public static void main(String[] args) {
		ComparableEmp ce = new ComparableEmp(100, "Balu", 25, 26000);
		// ce.compareTo(emp);
	}

}
