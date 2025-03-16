package com.naveen.asignments;

/*18. WAP that accepts 2 positive integers between 1 to 1000 inclusive. The program should calculate and print the number if it is perfect number.
Hint: A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take the number 6: 
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. 
Therefore, 6 is a perfect number (as well as the first perfect number).
*/
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second positive integer: ");
        int num2 = sc.nextInt();
        
        if (num1 < 1 || num1 > 1000 || num2 < 1 || num2 > 1000) {
            System.out.println("Please enter integers between 1 and 1000 inclusive.");
        } else {
            checkPerfectNumber(num1);
            checkPerfectNumber(num2);
        }

        sc.close();
    }

    public static void checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
