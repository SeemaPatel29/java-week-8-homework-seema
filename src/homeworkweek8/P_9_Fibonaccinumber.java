package homeworkweek8;

import java.util.Scanner;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P_9_Fibonaccinumber {


       public  static void main(String[] args) {
          // using scanner to read input and get output from consloe

            Scanner scan = new Scanner(System.in);
            System.out.println("Fibonacci Series upto number you want");
            int n = scan.nextInt();
            scan.close();
            int firstTerm=1, secondTerm =1;
            // used for loop
            for (int i =1; i<=n; i++){
                System.out.println(firstTerm + ",");
                //enter the  thrid variable nextTerm
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }

        }


    }
