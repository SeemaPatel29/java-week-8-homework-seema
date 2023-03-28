package homeworkweek8;

/**
 * 8. Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class P_8_AngleTriangle {
    public static void main(String[] args) {
        int number=6;
       rightTriangle(number);
    }
    //int i;
    // static method
    public static void rightTriangle(int n){
        for (int i=0;i<n;i++){ //outer loop; number of rows
            for (int j =0; j<+i; j++){ //inner loop of columns
                System.out.print("@"); //print  a "@"
            }
            System.out.println(); //go to next line
        }
    }

}
