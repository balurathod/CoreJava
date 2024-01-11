package com.rathod.oops;

public class Employee implements java.io.Serializable
{
   public String name;
   public void setName(String name) {
	this.name = name;
}
public void setAddress(String address) {
	this.address = address;
}
public void setSSN(int sSN) {
	SSN = sSN;
}
public void setNumber(int number) {
	this.number = number;
}
public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}
