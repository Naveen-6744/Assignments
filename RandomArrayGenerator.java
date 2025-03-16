package com.naveen.asignments;

/*17. WAP that accepts number of elements (positive integer) and generates array with size of given number and fills all values with random numbers within 100.
Hint: Use Random random = new Random();
randomNum = random.nextInt(100);
*/
import java.util.Random;
import java.util.Scanner;

public class RandomArrayGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = sc.nextInt();
        int[] array = new int[numElements];
        Random random = new Random();
        for (int i = 0; i < numElements; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Generated array with random numbers:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}