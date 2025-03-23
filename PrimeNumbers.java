//5. WAP to group list of numbers by Prime number or not
package com.naveen.asignments;

import java.util.*;
import java.util.stream.Collectors;

public class PrimeNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		Map<String, List<Integer>> groupedNumbers = numbers.stream()
				.collect(Collectors.groupingBy(num -> isPrime(num) ? "Prime" : "Non-Prime"));

		groupedNumbers.forEach((type, numList) -> System.out.println(type + " Numbers: " + numList));
	}

	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
