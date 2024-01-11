package com.rathod.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

public class FilterDuplicateData {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        //List<Integer> repeatingNumbers = myList.of(numbers).distinct(2).toList();

        Set<Integer> duplicated = myList.stream()
                                        .filter(n -> myList
                                                .stream()
                                                .filter(x -> x == n)
                                                .count() > 1)
                                        .collect(Collectors.toSet());
        System.out.println("duplicated " + duplicated);


        Set<Integer> result = findDuplicateBySetAdd(myList);

        result.forEach(System.out::println);

    }
    

    // List<Integer> filterData = myList.stream().collect(Collectors.toSet(Arrays.asList()))

     public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

        Set<T> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
                .collect(Collectors.toSet());

    }
}
