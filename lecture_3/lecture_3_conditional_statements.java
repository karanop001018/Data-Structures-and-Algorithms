package lecture_3;
import java.util.*;

public class lecture_3_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        System.out.println("Enter any random number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("It's even");
        }else {
            System.out.println("It's odd");
        }

        System.out.println("Enter frist number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }else if(a>b){
                System.out.println("a is greater");
        }
        else {
            System.out.println("a is lesser");
        }

        System.out.println("Choose any one number 1,2 or 3: ");
        int button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
    Scanner close;
}
