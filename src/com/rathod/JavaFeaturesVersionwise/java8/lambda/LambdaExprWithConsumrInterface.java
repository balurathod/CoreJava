package com.rathod.JavaFeaturesVersionwise.java8;
//A Java program to demonstrate simple lambda expressions 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors; 

public class LambdaExprWithConsumrInterface {
	    public static void main(String args[]) 
	    { 
	        // Creating an ArrayList with elements {1, 2, 3, 4} 
	        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
	        arrL.add(1); 
	        arrL.add(2); 
	        arrL.add(3); 
	        arrL.add(4); 
	  
	        // Using lambda expression to print all elements of arrL 
	        arrL.forEach(n -> System.out.println(n)); 
	  
	        // Using lambda expression to print even elements of arrL 
	        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
	        
	        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
			//get count of empty string
			int count = (int) strings.parallelStream().filter(string -> strings.isEmpty()).count();
			System.out.println("count " + count);
			//It is very easy to switch between sequential and parallel streams.


			Random random = new Random();
			random.ints().limit(10).forEach(System.out::println);

			List<Integer> num = Arrays.asList(1,2,3,4,5,9,6);
			List<Integer> SqrList = num.stream().map(i-> i*i).distinct().collect(Collectors.toList());
	    } 
	}
	
/*	
Output :

	1
	2
	3
	4
	2
	4
	
	Note that lambda expressions can only be used to implement functional interfaces. 
	In the above example also, the lambda expression implements Consumer Functional Interface.

*/