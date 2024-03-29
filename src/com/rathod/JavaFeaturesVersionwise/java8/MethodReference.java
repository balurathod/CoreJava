package com.rathod.JavaFeaturesVersionwise.java8;
//In the following example, we have defined a functional interface and referring a static method 
//to it's functional method say().
interface Sayable{  
    void say();  
}  

public class MethodReference {
  
    public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  