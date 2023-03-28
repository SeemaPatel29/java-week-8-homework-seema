package homeworkweek8;

import java.util.Scanner;

/**
 12. Write a programme to input any number and check if it is prime or not.
 (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 17.... are the prime numbers.)
 */

public class P_12_PrimeNumber {
    public static void main(String[] args) {
        prime();
    }
    public static void prime(){
        // used scanner
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prim number or not :");
        int number =scan.nextInt();

        if (isPrime(number)){
            System.out.println(number + " is prime number");
            scan.close();
        } else {
            System.out.println((number + " is not a prime number"));
        }
        // used for loop
    }
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) ;
                return false;

            }
            return true;
        }
    }

