//3. WAP to group list of strings by the vowel count
package com.naveen.asignments;

import java.util.*;
import java.util.stream.Collectors;

public class VowelCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Sapota", "banana", "orange", "Kiwi", "Grape", "umbrella", "Mango", "cherry");

        
        Map<Integer, List<String>> groupedWords = words.stream()
            .collect(Collectors.groupingBy(word -> (int) word.chars()
                .filter(c -> "AEIOUaeiou".indexOf(c) != -1)
                .count()));

        
        groupedWords.forEach((vowelCount, wordList) -> 
            System.out.println("Vowel Count " + vowelCount + ": " + wordList));
    }
}
