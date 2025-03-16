package com.naveen.asignments;

/*11. WAP that prints the magic number of given number.
*/
import java.util.Scanner;

public class MagicNumber {
    public static int getMagicSum(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int magicSum = getMagicSum(num);

        if (magicSum == 1) {
            System.out.println(num + " is a MAGIC NUMBER!");
        } else {
            System.out.println(num + " is NOT a Magic Number.");
        }

        sc.close();
    }
}