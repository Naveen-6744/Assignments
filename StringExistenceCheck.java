package com.naveen.asignments;

/*23. WAP that accepts two strings and checks whether the second string exists in the first string.
*/
import java.util.Scanner;

public class StringExistenceCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        
        if (str1.contains(str2)) {
            System.out.println("The second string exists in the first string.");
        } else {
            System.out.println("The second string does not exist in the first string.");
        }
        
        sc.close();
    }
}

