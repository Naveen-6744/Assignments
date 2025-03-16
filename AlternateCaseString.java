package com.naveen.asignments;

/*24. WAP that accepts a string and generates new string with alternative characters in Upper and Lower case.
*/
import java.util.Scanner;

public class AlternateCaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        
        String result = alternateCase(str);
        
        System.out.println("Generated string with alternate cases: " + result);
        
        sc.close();
    }
    
    public static String alternateCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch)); 
            } else {
                result.append(Character.toLowerCase(ch)); 
            }
        }
        
        return result.toString();
    }
}