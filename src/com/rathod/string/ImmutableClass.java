package com.rathod.string;

/*
 Declare the class as final so it can't be extended.
 
 Make all fields private so that direct access is not allowed.
 
 Don't provide setter methods for variables.
 
 Make all mutable fields final so that it's value can be assigned only once.
 
 Initialize all the fields via a constructor performing deep copy.
 
 Perform cloning of objects in the getter methods to return a copy rather than returning 
 the actual object reference.
 */
public final class ImmutableClass {

	private String panCard = "AURPR9936P";

	public ImmutableClass(String rtrgr) {
		System.out.println(rtrgr);
		// this.panCard = rtrgr;
	}

	public String getPanCard() {
		System.out.println("in get mtd " + panCard);
		return panCard;
	}

	public void setPanCard(String pCard) {
		this.panCard = pCard;
		System.out.println("dfd" + pCard);
	}

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass("zazas");
		ic.getPanCard();
		ic.setPanCard("ttyty");
	}

}
