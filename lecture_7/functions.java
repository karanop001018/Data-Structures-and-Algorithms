package lecture_7;
import java.util.*;
public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();

        printMyName(name); //called the function "printMyName"
    }

}
