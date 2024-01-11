package com.rathod.oops;

import java.util.EnumSet;

public enum EnumSimpleEx {
	vitthal("Nice","20"), //objects creatd with two ele
	Anita("Orphan","13"), //its internally nothing but an array of object.
	Damini("Fat","19"),
	Nisha("Black Beautifull","13"), 
	TeenAge("Black Sweet","23"),
	Aruna("Beautifull","13"), 
	Shindu("Sweet","23");
	
	private final String desc; //enum variable always final
	private final String year; 
	
	EnumSimpleEx(String description, String birthYear){
		desc = description;
		year = birthYear; 
		
	}

	public String getDesc() {
		return desc;
	}

	
	public String getYear() {
		return year;
	}
	
	public static void main(String[] args) {
		for (EnumSimpleEx person : EnumSimpleEx.values()) {
			System.out.printf("%s\t%s\t%s\n", person, person.getDesc(),person.getYear());
		} 
		
		System.out.println("\nAnd now for range of Constant");//provide new array hving spcfic ele
		
		for (EnumSimpleEx person : EnumSet.range(EnumSimpleEx.Anita, EnumSimpleEx.Aruna)) {//provide new array hving spcfic data
			System.out.printf("%s\t%s\t%s\n", person, person.getDesc(),person.getYear());
		}
		
	}

}
