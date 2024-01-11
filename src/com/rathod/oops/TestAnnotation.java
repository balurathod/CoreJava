package com.rathod.oops;

import java.util.ArrayList;

class Animal{ 
	@Deprecated //@Deprecated annoation marks that this method is deprecated so compiler prints warning. It informs user that it may be removed in the future versions. So, it is better not to use such methods.
void eatSomething(){System.out.println("eating something");}  
}  
  
class Dog extends Animal{  
	//@Override  //it shows error at compile time if givenmtd not overriding 
	void eatsomething(){System.out.println("eating foods");}//should be eatSomething  
}  
  
class TestAnnotation{  
	@SuppressWarnings("unchecked") //it will show warning at compile time because we are using non-generic collection.
	public static void main(String args[]){  
		Animal a=new Dog();  
		a.eatSomething();  
		
		//ArrayList<String> list=new ArrayList<String>();  
		ArrayList list=new ArrayList(); 
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj);  
	}
}  