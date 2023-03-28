package homeworkweek8;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class P_13_SharedDigit {
    // return method
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        }
           // while loop
        int digit1, digit2;
        while (number1 > 0) {
            digit1 = number1 % 10;
            int temp = number2;
            while (temp > 0) {
                digit2 = temp % 10;
                if (digit1 == digit2) {
                    return true;
                }
                temp /= 10;
            }
            number1 /= 10;
        }

        return false;

    }

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(25,85));
    }
}
