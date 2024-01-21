package com.rathod.assignments;
import java.
public class highestNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) −> x).summaryStatistics();

        System.out.println("Lowest number in List : " + stats.getMin());
    }
}
