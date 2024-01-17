package lecture_5;
import java.util.*;
public class practice_12 {
        public static void main(String[] args) {
            System.out.println("Enter the number of rows : ");
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Print numbers in ascending order
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                // Print numbers in descending order
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

