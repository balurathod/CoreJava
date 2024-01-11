package com.rathod.collection;

public class EqualHashCodePerson {

	private int id; 
	private String firstName; 
	private String lastName;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualHashCodePerson other = (EqualHashCodePerson) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
/*
 If you look above method we are first checking for "this" check which is fastest available 
 check for equals method then we are verifying whether object is null or not and object is of 
 same type or not. only after verifying type of object we are casting it into desired object 
 to avoid any ClassCastException in Java. Also while comparing individual attribute we are 
 comparing numeric attribute first using short circuit operator to avoid further calculation 
 if its already unequal and doing null check on member attribute to avoid NullPointerException.

 * */

	

}
