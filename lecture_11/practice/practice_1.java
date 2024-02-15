//Q. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

package lecture_11.practice;
import java.util.*;
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

//      input
//      rows
        for (int i=0; i<rows; i++){
//          columns
            for (int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to find in the matrix : ");
        int x = sc.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
//                compare with x
                if (numbers[i][j] == x){
                    System.out.println("x found at locations("+i+","+j+")");
                }
            }
        }
    }
}
