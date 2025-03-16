package com.naveen.asignments;

/*25. WAP that accepts a string and calculates total number of symbols in the given string.*/
import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        int symbolCount = countSymbols(str);
        
        System.out.println("Total number of symbols: " + symbolCount);
        
        sc.close();
    }
    
    public static int countSymbols(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        
        return count;
    }
}