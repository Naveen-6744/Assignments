package com.naveen.asignments;

/*6. WAP that accepts a number and prints the given number in word form.
*/
import java.util.Scanner;
public class NumWord{
     static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                                  "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                                  "Seventeen", "Eighteen", "Nineteen"};
    static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static String convertToWords(int num) {
        if (num == 0) return "Zero";   

        String words = ""; 
        if (num >= 10000000) {
            words += convertToWords(num / 10000000) + " Crore ";
            num %= 10000000;
        } 
        if (num >= 100000) {
            words += convertToWords(num / 100000) + " Lakh ";
            num %= 100000;
        } 
        if (num >= 1000) {
            words += convertToWords(num / 1000) + " Thousand ";
            num %= 1000;
        } 
        if (num >= 100) {
            words += convertToWords(num / 100) + " Hundred ";
            num %= 100;
        } 
        if (num >= 20) {
            words += tens[num / 10] + " ";
            num %= 10;
        }
        if (num > 0) {
            words += ones[num] + " ";
        }
         return words.trim();   
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number (0 - 99999999): ");
        int num = sc.nextInt();

        System.out.println(convertToWords(num));
        sc.close();
    }
}
