package com.rathod.JavaFeaturesVersionwise.java8;
//https://www.javatpoint.com/java-8-method-reference
import java.util.function.BiFunction;  

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class MtdRefExample {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}