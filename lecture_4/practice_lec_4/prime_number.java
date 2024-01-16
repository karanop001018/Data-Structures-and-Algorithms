//Print if a number is prime or not (Input n from the user).
//        [In this problem you will learn how to check if a number is prime or not]

package lecture_4.practice_lec_4;
import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime:");
        int n = scanner.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
