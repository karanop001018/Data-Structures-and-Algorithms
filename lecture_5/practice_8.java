package lecture_5;

import java.util.*;
public class practice_8 {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int number = 1;
        System.out.println("Enter from which number you want to print : ");
        int number = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

