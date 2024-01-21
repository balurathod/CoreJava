package com.rathod.JavaFeaturesVersionwise.java8;

import java.util.Arrays;
import java.util.List;

public class ParallelProcessing {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		//get count of empty string
		int count = strings.parallelStream().filter(strings -> string.isEmpty()).count();
		//It is very easy to switch between sequential and parallel streams.

	}

}
