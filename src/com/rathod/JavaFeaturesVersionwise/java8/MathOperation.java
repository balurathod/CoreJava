package com.rathod.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public interface MathOperation {
	 int operation(int a, int b);
	 List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	 IntSummaryStatistics stats = Integer.stream().mapToInt((x) -> x).summaryStatistics();
	 System.out.println("Highest number in List : " + stats.getMax());
}
	 