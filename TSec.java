package com.naveen.asignments;

/* 4. WAP that accepts time in seconds. Then it should print the time in "XXh YYm ZZs" format.
Hint: 1 hour = 60 minutes = 3600 seconds
*/
import java.util.Scanner;

public class TSec {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int tsec = sc.nextInt();
        sc.close();
        
        int hours = tsec / 3600;
        int minutes = (tsec % 3600) / 60;
        int seconds = tsec % 60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
    }
}