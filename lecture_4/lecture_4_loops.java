import java.util.Scanner;

public class lecture_4_loops {
    public static void main(String[] args){

//        for loop
        int i=0;
        for(i=0;i<=10;i++){
            System.out.println("Hi, my name is Karan Patel");
        }
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(j=0;j<=n;j++){
            System.out.println("Number : "+j);
        }


//        while loop
        int k = 0;
        while (k<=5){
            System.out.println(k);
            k=k+1;
        }


//        do-while loop
        int p = 0;
        do{
            System.out.println("Hello "+p);
            p++;
        }while (p<11);


//        Print the sum of n natural numbers.
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        int sum = 0;
        for (int z = 1; z <= x; z++) {
            sum += z;
        }
        System.out.println("The sum of the first " + x + " natural numbers is " + sum);


//        Print the table of a number input by the user.
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for (int y = 1; y <= 10; y++) {
            System.out.println(num + " * " + y + " = " + num * y);
        }
    }

}