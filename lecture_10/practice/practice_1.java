//Q. Take an array of names as input from the user and print them on the screen.

package lecture_10.practice;
import java.util.*;
public class practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        String names[] = new String[size];

        for(int i=0; i<size; i++){
            names[i] = sc.next();
        }

        for(int i=0; i< names.length; i++){
            System.out.println("Name "+ (i+1)+ " is : "+ names[i]);
        }
    }
}
