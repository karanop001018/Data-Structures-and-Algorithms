package lecture_10;
import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      int[] marks = new int[3]
//                OR
//        int marks[] = new int[3];

//        marks[0] = 97;//physics
//        marks[1] = 98;//chemistry
//        marks[2] = 100;//maths
//        System.out.println(marks); // Gives garbage value
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter an element of the array : ");
            numbers[i] = sc.nextInt();
        }
        for (int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }//As we have not given the array any value it would consider as a null value.So output will be 0,0,0,0,0,0. (In java it's called "Automatic Initialisation")


    }
}
