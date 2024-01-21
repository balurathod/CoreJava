package com.rathod.JavaFeaturesVersionwise.java8;

import java.util.function.Predicate;

public class FunIntrfcPredicate {

	/*public static int squareIt(int n) {
		return n*n;
	}	
	() -> System.out.println("Above converted into Lambda expression");
	
	public int squareIt(int a, int b) {
		return a+b;		
	}	
	(a, b) -> System.out.println(a+b);
	
	public int squareIt(int n) {
		return n*n;		
	}	
	(int n) -> { return n*n;}
	(n) -> return n*n;
	 n ->  n*n;

	
	*
	*/
	public static void main(String[] args) {
		
		//System.out.println("The square of 5 is "+squareIt(5));
		Predicate<Integer> p = i-> i%2==0;
		System.out.println("The square of 5 is "+p.test(4));
	}

}
