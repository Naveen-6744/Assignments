package com.naveen.asignments;

/*9. WAP that accepts a number between 1 and 1000 inclusive. In the range find whether the number is prime or not, along with total number of factors found for each number. At the end print the total number of prime numbers found.
Hint: Use appropriate messages for invalid input. Use proper data types and looping construct.
*/
import java.util.Scanner;

public class Range {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {  
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 1000: ");
        int num = sc.nextInt();

        if (num < 1 || num > 1000) {
            System.out.println("Enter a valid Number.");
        } else {
            boolean prime = isPrime(num);
            int factors = countFactors(num);
            System.out.println("Total factors of " + num + " = " + factors);
            if (prime) {
                System.out.println(num + " is a Prime Number.");
            } else {
                System.out.println(num + " is NOT a Prime Number.");
            }
        }

        sc.close();
    }
}