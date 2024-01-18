package lecture_6;
import java.util.Scanner;

public class practice_10 {
        public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the number of rows for the half pyramid:");
                    int n = scanner.nextInt();

                    // Print the half pyramid
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
        }
}
