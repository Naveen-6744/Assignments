package com.naveen.asignments;

/*5. WAP that accepts time in minutes and seconds. Then it should also print the time in "XXh YYm ZZs" format.
Validations:
1. The value for seconds and minutes must be > = 0 and <= 59. 
2. Handle invalid data entry with appropriate messages.
*/
import java.util.Scanner;

public class TimeValidate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes (0-59): ");
        int t_min = sc.nextInt();
        if (t_min < 0 || t_min > 59) {
            System.out.println("Invalid input! Minutes should be between 0 and 59.");
            System.exit(0);
        }
        
        System.out.print("Enter seconds (0-59): ");
        int t_sec = sc.nextInt();
        if (t_sec < 0 || t_sec > 59) {
            System.out.println("Invalid input! Seconds should be between 0 and 59.");
            System.exit(0);
        }
        
        sc.close();
        System.out.println("00h " + t_min + "m " + t_sec + "s");
    }
}