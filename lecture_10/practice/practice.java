//Q. Take an array as input from the user. Search for a given number x and print the index at which it occurs
package lecture_10.practice;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length = sc.nextInt();

        int[] array = new int[length];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i<length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search for : ");
        int x = sc.nextInt();

        for(int i=0; i<length; i++){
            if(array[i] == x){
                System.out.println("Number "+x+" is found at index "+ i);
                return;
            }
        }
        System.out.println("Number "+x+" is not found in the array.");
    }
}