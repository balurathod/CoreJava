package com.rathod.JavaFeaturesVersionwise.java8;

import java.util.Random;

public class FunIntrfcRandomForTenNumber {

	public static void main(String[] args) {
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
		System.out.println("===========");
		random.ints().limit(10).forEach(System.out::println);
		
	}
}
