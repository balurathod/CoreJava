package com.rathod.assignments.faq;

public class SubClass extends SuperClass {
	public void instanceMethod(){		 
		System.out.println("SubClassDemo instanceMethod called");
	}
	
	public static void staticMethod(){		 
		System.out.println("SubClassDemo staticMethod called");		 
	}
	
	public void show(){		 
		System.out.println("show method of subClass "); 
	}
	
	public static void main(String []args){
	  
	  SuperClass superObj= new SuperClass();
	  SuperClass  superObj1= new  SubClass(); 
	  SubClass subObj= new  SubClass(); 
	  // here no need to create object to call a static method please note that.

	  superObj.instanceMethod();
	  superObj1.instanceMethod();
	  subObj.instanceMethod();
	  
//	  superObj.staticMethod();
//	  superObj1.staticMethod(); 		//chk this?
//	  subObj.staticMethod();
	  
	  SuperClass.staticMethod();
	  SubClass.staticMethod();
	  
	  
	  superObj.a=10;	   
	  superObj.print();
	  //superObj.show(); // compile time error
	  System.out.println("a="+superObj.a); 
	  
	  subObj.print();
	  subObj.show();
	  System.out.println("a="+subObj.a); 
	  
	  superObj1.print();
	  //superObj1.show();	//comple Error : Bcoz subclass mtd is undefine for super class
	  System.out.println("a="+superObj1.a); 
	  
	  //subObj.b=20;  			compile time error. The field Super.b is not visible
	  //subObj.add(); 			compile time error : The method add() from the type Super is not visible
	 
	}
}
