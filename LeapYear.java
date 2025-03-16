package com.naveen.asignments;

/*7. WAP that accepts a number as year, between 1 and 9999 inclusive. If the number is not in range, print appropriate error message. If in range, calculate and print whether the given year is a leap year or not.
Hint: A year is leap year if it is divisible by 4 and 400 but not by 100.*/
import java.util.Scanner;

public class LeapYear{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year between 1 and 9999: ");
        int year = sc.nextInt();
        if (year<1 || year>9999){
            System.out.println("Year out of range! Enter a number between 1 and 9999.");
        }else{
             if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                 System.out.println(year + " is a Leap Year.");
             } else{
                 System.out.println(year + " is not a Leap Year.");
             }
        }
        sc.close();
    }    
} 
