package homeworkweek8;

import java.util.Scanner;

/**
 * 2. -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class P_2_MinAndMaxiInputChallenge {
    public static void main(String[] args) {
        // using scanner for reading input
        Scanner scan = new Scanner(System.in);
        int largestnumber = Integer.MIN_VALUE;
        int smallestnumber = Integer.MAX_VALUE;
        int number;
        double sum = 0;
         int amountOfNumbers = 0;
            // do while loop

        do {
            System.out.println("Enter any number , or enter less than '0' to stop :");
            number = scan.nextInt();
            if (number < 0) {
                break;
            }
            if (number > largestnumber) {
                largestnumber = number;
            }
            if (number < smallestnumber) {
                smallestnumber = number;
            }
            sum += number;
            amountOfNumbers++;
        } while (number >=0);
        if (amountOfNumbers > 0){
            System.out.println("The smallest number is : %d.%n" + smallestnumber);
            System.out.println("The largest number is  : %d.%n" + largestnumber);

            scan.close();

        }
    }
}