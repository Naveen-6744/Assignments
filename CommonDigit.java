package com.naveen.asignments;

/*14. WAP that accepts an integer between 10 and 99 inclusive. Valid message must be printed if any one or both values are not in the range. The program must
print the digit that appears in both numbers. For example: if 12 and 51 are given, then it should print 1. since 1 is available in both the numbers.
*/
import java.util.Scanner;
public class CommonDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number between (10-99): ");
        int num1 = sc.nextInt();
        sc.close();
         if(num1<10 || num1>99){
            System.out.println("Enter a valid number between (10-99).");
            return;
         }

        System.out.println("Enter a 2nd number between (10-99)");
        int num2 = sc.nextInt();
        if(num2<10 || num2>99){
            System.out.println("Enter a valid number between (10-99).");
            return;
        }
        int digit1_1 = num1/10;
        int digit1_2 = num1%10;
        int digit2_1 = num2/10;
        int digit2_2 = num2%10;
        if(digit1_1 == digit2_1 || digit1_1 == digit2_2){
            System.out.println("Common Digit: " + digit1_1);
        }
       else if(digit1_2 == digit2_1 || digit1_2 == digit2_2){
            System.out.println("Common Digit: " + digit1_2);
        }else{
         System.out.println("No Common Digit.");   
        }
         
    }
}