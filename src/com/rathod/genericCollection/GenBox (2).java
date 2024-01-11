package com.rathod.generics;

import java.util.List;

import org.omg.PortableInterceptor.Interceptor;

////Problem For Generics

//class Box {
//
//    private Object object;
//
//    public void add(Object object) {
//        this.object = object;
//    }
//
//    public Object get() {
//        return object;
//    }
//}
//
//
//public class GenBox {
//	  public static void main(String[] args) {
//
//	        // ONLY place Integer objects into this box!
//	        Box integerBox = new Box();
//
//	        integerBox.add(new Integer(10));
//	        
//	        // Imagine this is one part of a large application
//	        // modified by one programmer. 
//	        integerBox.add("10"); // note how the type is now String
//    
//	        Integer someInteger = (Integer)integerBox.get();
//	        System.out.println(someInteger);
//	  }
//
//}


////Solution for Generics

class Box<T> {		//T is a formal type parameter of the Box class. 

	private T t; 	// T stands for "Type"          

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
    //public <U> void inspect(U u){
    public <U extends Number> void inspect(U u){
  //  public <U extends Number & Interceptor> void inspect(U u){//To specify additional interfaces that must be implemented, use the & character, as in: 
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    
    public static <U> void fillBoxes(U u, List<Box<U>> boxes) {//this mtd not understnd
        for (Box<U> box : boxes) {
            box.add(u);
        }
    }
    /*
     * To use this method, your code would look something like the following: 
Crayon red = ...;
List<Box<Crayon>> crayonBoxes = ...;
The complete syntax for invoking this method is: 
Box.<Crayon>fillBoxes(red, crayonBoxes);
Here we've explicitly provided the type to be used as U, but more often than not, this can be left out and the compiler will infer the type that's needed: 
Box.fillBoxes(red, crayonBoxes); // compiler infers that U is Crayon
This feature, known as type inference, allows you to invoke a generic method as you would an ordinary method, without specifying a type between angle brackets

     * */


}


public class GenBox {
	  public static void main(String[] args) {

	    Box<Integer> integerBox = new Box<Integer>();
	    integerBox.add(new Integer(10));
	    //integerBox.add("10");
	    
	    Integer someInteger = integerBox.get(); // no cast!
	    System.out.println(someInteger);
	    
	    integerBox.inspect("Some Test");
	 }
}



/*
 * 
The most commonly used type parameter names are: 
•	E - Element (used extensively by the Java Collections Framework) 
•	K - Key 
•	N - Number 
•	T - Type 
•	V - Value 
•	S,U,V etc. - 2nd, 3rd, 4th types 

< > - angle brackets
 * 
 */