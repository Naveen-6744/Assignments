package com.naveen.asignments;

/*13. WAP that accepts a range between 1 and 1000 and prints all the palindromes in the range.*/
public class PalindromeInRange {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        
        return original == reverse;
    }

    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            if (isPalindrome(num)) {
                System.out.println(num);
            }
        }
    }
}
