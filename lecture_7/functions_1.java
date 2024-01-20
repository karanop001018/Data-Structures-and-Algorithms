package lecture_7;

import java.util.Scanner;

public class functions_1 {
//    Q. Make a function to add 2 numbers and return the sum.
//    Method-1

//    public static void addNumbers(int sum){
//        int a = 0;
//        int b;
//        System.out.println("The sum is "+ sum);
//        return;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number : ");
//        int a = sc.nextInt();
//        System.out.println("Enter second number : ");
//        int b = sc.nextInt();
//        int sum = a+b;
//        addNumbers(sum);
//    }

//    Method-2
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    //Q Multiply 2 numbers.
    public static int multiply(int c, int d){
        return c * d;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("The sum of 2 numbers is : " + sum);


        System.out.println("Enter first number : ");
        int c = sc.nextInt();
        System.out.println("Enter second number : ");
        int d = sc.nextInt();
        int product = c*d;
        System.out.println("The sum of 2 numbers is : " + product);
    }
}
