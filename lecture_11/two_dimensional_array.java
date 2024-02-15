package lecture_11;
import java.util.*;
public class two_dimensional_array {
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
//      output
        for (int i=0;i<rows;i++){
            for(int j=0; j<columns; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
