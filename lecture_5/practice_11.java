package lecture_5;
import java.util.*;
public class practice_11 {
        public static void main(String[] args) {
            System.out.println("Enter number of rows : ");
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Print numbers with no space between them
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
