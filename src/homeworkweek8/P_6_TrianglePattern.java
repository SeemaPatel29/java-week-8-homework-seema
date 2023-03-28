package homeworkweek8;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class P_6_TrianglePattern {
    public static void main(String[] args) {
        int num;
        //using scanner to read input and get output in console
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of rows :");
        num = scan.nextInt();
        scan.close();
        // used for loop
        for (int i =1; i <=num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }
}