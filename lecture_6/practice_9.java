package lecture_6;
import java.util.Scanner;
public class practice_9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows for Pascal's Triangle:");
            int n = scanner.nextInt();

            // Print Pascal's Triangle
            for (int i = 0; i < n; i++) {
                int number = 1;
                System.out.format("%"+(n-i)*2+"s", "");
                for (int j = 0; j <= i; j++) {
                    System.out.format("%4d", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
