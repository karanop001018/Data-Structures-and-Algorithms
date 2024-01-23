//Q. Write a function which takes in 2 numbers and returns the greater of those two.

package lecture_8;
import java.util.*;
public class practice_2 {
    public static int getGreater(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("The number that is greater is : " + getGreater(a, b));
    }
}