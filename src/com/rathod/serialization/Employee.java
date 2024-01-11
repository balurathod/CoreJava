package com.rathod.serialization;

public class Employee implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5340103877943369970L;
	public String name;
	public String address;
	// Transient variable in java is not persisted or saved when an object gets
	// serialized.
	public transient int SSN;
	// you can declare an variable static and transient at same time and java
	// compiler doesn't complain
	// but doing that doesn't make any sense because transient is to instruct
	// "do not save this field" and static variables are not saved anyway during
	// serialization. see below eg
	public static transient byte bytes;
	// you can apply transient and final keyword together to a variable compiler
	// will not complain but you will face another problem of reinitializing a
	// final variable during deserialization.
	public final transient short shrt = 20;
	public int number;

	public void mailCheck() {
		// public transient int num = 10;// cant apply transient on local var

		System.out.println("Mailing a check to " + name + " " + address);
	}

}
