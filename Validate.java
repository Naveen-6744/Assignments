package com.naveen.asignments;

/*1. WAP that accepts 2 integers and a target. Validate if the sum of two numbers is equal to given target. */

import java.util.Scanner;
public class Validate{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 =sc.nextInt(); 
        System.out.print("Enter num2: ");
        int num2 =sc.nextInt(); 
        System.out.print("Enter Target: ");
        int target =sc.nextInt(); 
        System.out.println((num1+num2==target)? "Equal" : "Not Equal");
        sc.close();
    }
    
}