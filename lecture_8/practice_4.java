//Q. Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.


package lecture_8;
import java.util.*;
public class practice_4 {
    public static boolean elligible(int age){
        if(age>18){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Eligible for Voting : " + elligible(age));
    }
}
