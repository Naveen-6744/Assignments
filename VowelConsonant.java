// 1. WAP to group list of strings by Vowel or Consonant
package com.naveen.asignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VowelConsonant {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Apple", "Sapota", "banana", "orange", "Kiwi", "Grape", "umbrella", "Mango",
				"cherry");
		Set<Character> vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
		List<String> vowelGroup = new ArrayList<>();
		List<String> consonantGroup = new ArrayList<>();

		for (String word : words) {
			char firstChar = Character.toUpperCase(word.charAt(0));
			if (vowels.contains(firstChar)) {
				vowelGroup.add(word);
			} else {
				consonantGroup.add(word);
			}
		}
		System.out.println("Vowel Group: " + vowelGroup);
		System.out.println("Consonant Group: " + consonantGroup);

	}

}
