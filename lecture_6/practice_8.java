package lecture_6;

import java.util.Scanner;
public class practice_8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the side length of the Rhombus:");
            int n = scanner.nextInt();

            // Print the hollow rhombus
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                if (i == 1 || i == n)
                    for (int j = 1; j <= n; j++)
                        System.out.print("*");
                else {
                    System.out.print("*");
                    for (int j = 1; j <= n - 2; j++)
                        System.out.print(" ");
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
