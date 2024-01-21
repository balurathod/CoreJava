package com.rathod.JavaFeaturesVersionwise.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterArraylist {
	 public static void main(String[] args) {

	        List<String> lines = Arrays.asList("spring", "node", "mkyong");

	        List<String> result = lines.stream()                // convert list to stream
	                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
	                .collect(Collectors.toList());              // collect the output and convert streams to a List

	        result.forEach(System.out::println);                //output : spring, node
	        
	        
	        List<String> result1 = lines.stream()                // convert list to stream
	                .filter(line -> !lines.equals(1))     // filter string whose length = 4
	                .collect(Collectors.toList());              // collect the output and convert streams to a List

	        result1.forEach(System.out::println);                //output : spring, node


	    }

	}