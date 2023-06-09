package homeworkweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class P_10_ArmstrongNumber {
    public static void main(String[] args) {
        armstrong();
    }

    public static void armstrong(){
        // used scanner for reading data
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scan.nextInt(), originalNumber, remainder, result =0, n =0;

        for (originalNumber = number; originalNumber !=0; originalNumber /=10, ++n);

        for (originalNumber = number; originalNumber !=0; originalNumber /=10){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);

            // used if loop
        }
        if (result == number){
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not as Armstrong number.");
            scan.close();
        }

    }
}
