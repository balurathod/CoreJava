package com.rathod.oops;

/*
 * =======Coupling 
 * 
 Coupling refers to the degree to which one class knows about or uses members
 of another class.
 Loose coupling is the desirable state of having classes that are well encapsulated,
 minimize references to each other, and limit the breadth of API usage.
 Tight coupling is the undesirable state of having classes that break the rules of
 loose coupling.

 ========Cohesion
 Cohesion Classes should model a single entity.
 Cohesion Classes should have a well define role.
 Avoid modeling multiple objects in a class
 Avoid a jack of all Trades class 
 Aim for related methods & instance variables
 Strive for highly cohesive classes

 --Benefit of cohesive class
 more readable
 easier to use
 easier to maintain
 Re-usability

 Cohesion refers to the degree in which a class has a single, well-defined role
 or responsibility.
 High cohesion is the desirable state of a class whose members support a
 single, well-focused role or responsibility.
 Low cohesion is the undesirable state of a class whose members support multiple,
 unfocused roles or responsibilities.
 */
public class CohesiveEx {

	private int busNumber;
	private int busFee;
	private String busDriver;

	public static void main(String[] args) {
		CohesiveEx publicTransportation = new CohesiveEx();
		publicTransportation.getBusNumber();
		publicTransportation.setBusRoute();
		publicTransportation.payBusFee();
	}

	public int getBusNumber() {
		return 0;
	}

	public void setBusRoute() {

	}

	public void payBusFee() {

	}
}
