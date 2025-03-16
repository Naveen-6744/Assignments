package com.naveen.asignments;

/*20. WAP that accepts a string and counts total vowels and consonants in the given string.
*/
import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        
        int vowels = 0;
        int consonants = 0;
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);
        
        sc.close();
    }
}
