package com.naveen.asignments;

/*3. WAP to convert the given height in feet and inches to centimeters.
Hint: 1 foot = 12 inches
*/
import java.util.Scanner;
public class FICen{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in Feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter your height in Inch: ");
        double inch = sc.nextDouble();
        System.out.println("Your height in Centimeters is: "+ ((feet*30.48)+(inch*2.54)));
        sc.close();
    }
}