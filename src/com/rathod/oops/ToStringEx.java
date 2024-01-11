package com.rathod.oops; //Every package performing two function
//1 - A library to organized your code, sensible fashion that enables to find files need quickly.
//2 - They stopping having conflict between class names.

class Frogs {
	private int id ;
	private String name;
	
	public Frogs(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String toString(){//this mtd represents value of an object.
		
		return String.format("%-4d : %s", id, name);//use full for debugging
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" : ").append(name);
		return sb.toString();
		*/
		
		//return "id : "+id+" & Name : "+name;
	}
	
	
}
public class ToStringEx {

	public static void main(String[] args) {
		
		Frogs frog = new Frogs(3,"Rathod");
		Frogs frog1 = new Frogs(5,"Balu");
		
		System.out.println(frog);
		System.out.println(frog1);
	}

}
