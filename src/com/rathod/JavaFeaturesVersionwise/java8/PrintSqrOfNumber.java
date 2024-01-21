package com.rathod.JavaFeaturesVersionwise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSqrOfNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("Square Number " + squaresList);
	}

}
