//4. WAP to group list of numbers by their Ranges
package com.naveen.asignments;

import java.util.*;
import java.util.stream.Collectors;

public class Ranges {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 12, 25, 18, 33, 39, 44, 52, 67, 78, 85);
		Map<String, List<Integer>> groupedNumbers = numbers.stream().collect(Collectors.groupingBy(num -> {
			int lower = (num / 10) * 10 + 1;
			int upper = lower + 9;
			return lower + "-" + upper;
		}));

		groupedNumbers.forEach((range, numList) -> System.out.println("Range " + range + ": " + numList));
	}
}
