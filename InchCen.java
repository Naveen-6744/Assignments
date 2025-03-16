package com.naveen.asignments;

/*2. WAP to convert the given height in inches to centimeters.
Hint: 1 inch = 2.54 cm.
*/
import java.util.Scanner;
public class InchCen {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your height in inches: ");
      float inch = sc.nextFloat();
      System.out.println("Your height in Centimeters is: " + (inch*2.54f));
      sc.close();
  }
}