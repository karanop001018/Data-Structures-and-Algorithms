//Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
//        If the user enters 1 then keep taking input from the user for a student’s
//        marks(out of 100).
//        If they enter 0 then stop.
//        If he/ she scores :
//        Marks >=90 -> print “This is Good”
//        89 >= Marks >= 60 -> print “This is also Good”
//        59 >= Marks >= 0 -> print “This is Good as well”
//        Because marks don’t matter but our effort does.
//        (Hint : use do-while loop but think & understand why)

package lecture_4.practice_lec_4;
import java.util.*;
public class menu_driven_program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any one : 0 or 1");
        int a = sc.nextInt();
        if (a==0){
            System.out.println("Sorry!, Better Luck Next Time");
        }
        if(a==1){
            System.out.println("Enter yout marks (out of 100) : ");
            float marks = sc.nextFloat();
            if(marks >= 90){
                System.out.println("This is Good");
            } else if (marks>=60 && marks<=89) {
                System.out.println("This is also Good");
            } else if (marks>=59) {
                System.out.println("This is Good as well. Because marks don’t matter but our effort does.");
            }
        }
    }
}

