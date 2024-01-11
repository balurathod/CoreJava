package com.rathod.oops;

public class TestAnoynymousInner {
	 public static void main(String args[]){  
	 //Eatable e=new Eatable(){ //AnoynymousInner class using Interface.
	 Person p = new Person() {  //AnoynymousInner class using abstract class.
		 public void eat(){System.out.println("nice fruits");}  
	 };  
	 //e.eat();  
	 p.eat();
	 }  
}  