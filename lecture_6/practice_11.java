package lecture_6;

import java.util.Scanner;
public class practice_11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of rows for the inverted half pyramid:");
            int n = scanner.nextInt();

            // Print the inverted half pyramid
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
}
