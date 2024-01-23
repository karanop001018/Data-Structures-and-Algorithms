//Q. Write a function to print the sum of all odd numbers from 1 to n.
package lecture_8;
import java.util.*;
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sumOfOdds(n));
    }
    public static int sumOfOdds(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
