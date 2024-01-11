package com.rathod.java8;

	
// A simple program to demonstrate the use of predicate interface 
import java.util.*; 
import java.util.function.Predicate; 
	  
public class FunIntfcUsePredicate {

    public static void main(String args[]) 
    { 
        // create a list of strings 
        List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2"); 
  
        // declare the predicate type as string and use lambda expression to create object 
        Predicate<String> p = (s)->s.startsWith("G"); 
  
        // Iterate through the list 
        for (String st:names) 
        { 
            // call the test method 
            if (p.test(st)) 
                System.out.println(st); 
        } 
    } 
}
/*	
	Output:

	Geek
	GeeksQuiz
	Geek2
	
	
	Important Points/Observations:

	A functional interface has only one abstract method but it can have multiple default methods.
	@FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. The use of this annotation is optional.
	The java.util.function package contains many builtin functional interfaces in Java 8.
	
	*/