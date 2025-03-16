package com.naveen.asignments;

/*12. WAP that accepts an integer and checks if the given number is palindrome or not. The program must accept positive numbers only.
*/
import java.util.Scanner;
public class Palindrome{
    public static boolean isPalindrome(int num){
        int original = num;
        int reverse = 0;
        while(num>0){
            int digit = num%10;;
            reverse = reverse*10+digit;
            num/=10;
        }
          return original == reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
       int num = sc.nextInt();
       if (isPalindrome(num)){
           System.out.println(num+"is a Plaindrome");
       }else{
           System.out.println(num+"is not a Plaindrome"); 
       }
    }
}
