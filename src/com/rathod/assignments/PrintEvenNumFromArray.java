package com.rathod.assignments;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*Java 8 Program to find Even Numbers from an Array*/
public class PrintEvenNumFromArray {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 8, 99, 1, 22, 4, 3, 77, 66};
        Arrays.stream(numbers).filter(o -> o % 2 == 0).
                              forEach(System.out::println);

        Set<Integer> number = Set.of(1, 4, 8, 40, 11, 22, 33, 99);
        Set<Integer> oddNumbers = number.stream().
                                    filter(o -> o % 2 != 0).
                                    collect(Collectors.toSet());
        System.out.println(oddNumbers);
    }
}