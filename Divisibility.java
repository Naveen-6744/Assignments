//2. WAP to group list of numbers by their Divisibility (2, 5, or neither)
package com.naveen.asignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Divisibility {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 3, 5, 8, 7, 10, 16, 25, 29, 60);
		List<Integer> num2 = new ArrayList<>();
		List<Integer> num5 = new ArrayList<>();
		List<Integer> remaining = new ArrayList<>();
		for (Integer nums : num) {
			if (nums % 2 == 0) {
				num2.add(nums);
			} else if (nums % 5 == 0) {
				num5.add(nums);
			} else {
				remaining.add(nums);
			}
		}
		System.out.println("Number divided by 2 are: " + num2);
		System.out.println("Number divided by 5 are: " + num5);
		System.out.println("Remaing numbers are: " + remaining);
	}

}
