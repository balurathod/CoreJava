package com.rathod.assignments.faq;

class StaticOverridingParent {
	public static void staticMethod() {
		System.out.println("staticMethod(): Parent class");
	}

	public void nonStaticMethod() {
		System.out.println("nonStaticMethod(): Parent class");
	}
}

public class StaticOverriding extends StaticOverridingParent {

	public static void staticMethod() {
		System.out.println("staticMethod(int a): child class");
	}

	public void nonStaticMethod() {
		System.out.println("nonStaticMethod(): child class");
	}

	public static void main(String[] args) {
		StaticOverriding.staticMethod();
		StaticOverridingParent.staticMethod();
		StaticOverridingParent sop = new StaticOverriding();
		sop.nonStaticMethod();
		StaticOverridingParent sop1 = new StaticOverridingParent();
		sop1.nonStaticMethod();
		
	}
}


//

/* Java program to show that if static method is redefined by 
   a derived class, then it is not overriding. 
  
// Superclass 
class Base { 
      
    // Static method in base class which will be hidden in subclass  
    public static void display() { 
        System.out.println("Static or class method from Base"); 
    } 
      
     // Non-static method which will be overridden in derived class  
     public void print()  { 
         System.out.println("Non-static or Instance method from Base"); 
    } 
} 
  
// Subclass 
class Derived extends Base { 
      
    // This method hides display() in Base  
    public static void display() { 
         System.out.println("Static or class method from Derived"); 
    } 
      
    // This method overrides print() in Base  
    public void print() { 
         System.out.println("Non-static or Instance method from Derived"); 
   } 
} 
  
// Driver class 
public class Test { 
    public static void main(String args[ ])  { 
       Base obj1 = new Derived(); 
         
       // As per overriding rules this should call to class Derive's static  
       // overridden method. Since static method can not be overridden, it  
       // calls Base's display()  
       obj1.display();   
         
       // Here overriding works and Derive's print() is called  
       obj1.print();      
    } 
} 

*/