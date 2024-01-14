//Make a program that prints the table of a number that is input by the user


package lecture_2.practice_lec_2;
import java.util.*;
public class table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table(upto 10): ");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table of " + number + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
