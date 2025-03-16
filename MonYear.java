package com.naveen.asignments;

/*8. WAP that accepts two numbers month and year. Both month must be between 1 and 12 inclusive and year value must be between 1 and 9999 inclusive. Print the number of days in given month.
Validation: If the given year is leap year and month as 2, then it must display 29 days, if not must print 28 days for month 2.
*/
import java.util.Scanner;

public class MonYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month between 1 and 12: ");
        int mon = sc.nextInt();

        if (mon < 1 || mon > 12) {
            System.out.println("Enter a valid month.");
        } else {
            System.out.print("Enter a year between 1 and 9999: ");
            int year = sc.nextInt();

            if (year < 1 || year > 9999) {
                System.out.println("Enter a valid year.");
            } else {
                if (mon == 2) {
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
                    System.out.println("30 days");
                } else {
                    System.out.println("31 days");
                }
            }
        }
        
        sc.close();
    }
}