package com.naveen.asignments;

/*10. WAP that loops between 1 and 1000 inclusive. Accept 2 numbers and print out the numbers that are divisible by given 2 numbers. Once after finding 5 numbers, come out of the loop and print the sum of all the 3 numbers.
*/
import java.util.Scanner;
public class SumThree{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        int count= 0;
        int totalsum = 0;
        for(int i=1;i<=1000; i++) {
        if(i%num1==0 && i%num2==0){
            System.out.println(i);
            totalsum += i;
            count++;
        }
       if (count==5) {
           break;
       }
      
    }
     System.out.println("Sum of three numbers: "+ totalsum);
       sc.close();
    
}
}
