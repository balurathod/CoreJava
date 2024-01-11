package com.rathod.genericCollection;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Balu Rathod
 */
public class CustmSortingUsingComparatorForEmployee implements Comparable<CustmSortingUsingComparatorForEmployee> {
	private int id;
	private String name;
	private int salary;
	private int age;
	private Date dateOfJoining;

	public static final Comparator<CustmSortingUsingComparatorForEmployee> AgeComparator = new Comparator<CustmSortingUsingComparatorForEmployee>() {

		@Override
		public int compare(CustmSortingUsingComparatorForEmployee o1, CustmSortingUsingComparatorForEmployee o2) {
			return o1.age - o2.age; // This will work because age is positive integer
		}

	};

	public static final Comparator<CustmSortingUsingComparatorForEmployee> SalaryComparator = new Comparator<CustmSortingUsingComparatorForEmployee>() {

		@Override
		public int compare(CustmSortingUsingComparatorForEmployee o1, CustmSortingUsingComparatorForEmployee o2) {
			return o1.salary - o2.salary; // salary is also positive integer
		}

	};

	public static final Comparator<CustmSortingUsingComparatorForEmployee> NameComparator = new Comparator<CustmSortingUsingComparatorForEmployee>() {

		@Override
		public int compare(CustmSortingUsingComparatorForEmployee o1, CustmSortingUsingComparatorForEmployee o2) {
			return o1.name.compareTo(o2.name);
		}

	};

	public static final Comparator<CustmSortingUsingComparatorForEmployee> DOJComparator = new Comparator<CustmSortingUsingComparatorForEmployee>() {

		@Override
		public int compare(CustmSortingUsingComparatorForEmployee o1, CustmSortingUsingComparatorForEmployee o2) {
			return o1.dateOfJoining.compareTo(o2.dateOfJoining);
		}

	};

	public CustmSortingUsingComparatorForEmployee(int id, String name, int salary, int age, Date dateOfJoining) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.age = age;
	        this.dateOfJoining = dateOfJoining;
	    }

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dateOfJoining="
				+ dateOfJoining + '}';

	}

	@Override
	public int compareTo(CustmSortingUsingComparatorForEmployee o) {
		return this.id - o.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CustmSortingUsingComparatorForEmployee other = (CustmSortingUsingComparatorForEmployee) obj;
		if (this.id != other.id) {
			return false;
		}
		if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
			return false;
		}
		if (this.salary != other.salary) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		if (this.dateOfJoining != other.dateOfJoining
				&& (this.dateOfJoining == null || !this.dateOfJoining.equals(other.dateOfJoining))) {

			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + this.id;
		hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 47 * hash + this.salary;
		hash = 47 * hash + this.age;
		hash = 47 * hash + (this.dateOfJoining != null ? this.dateOfJoining.hashCode() : 0);
		return hash;
	}

}

// Read more:
// https://javarevisited.blogspot.com/2014/01/java-comparator-example-for-custom.html#ixzz5drjwPPGx