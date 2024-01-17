//Q1 *****
//   *****
//   *****
//   *****

package lecture_5;
import  java.util.*;
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in output: ");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns you want in output: ");
        int b = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" * ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
