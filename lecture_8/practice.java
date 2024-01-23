//Q. Enter 3 numbers from the user & make a function to print their average.

package lecture_8;
import java.util.*;
public class practice{
    public static float average(float a,float b, float c)
    {
        return (a+b+c)/3;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        float a = sc.nextInt();
        System.out.println("Enter second number : ");
        float b = sc.nextInt();
        System.out.println("Enter third number : ");
        float c = sc.nextInt();
        float avg = average(a,b,c);
        System.out.println("The ave of three numbers is : " + avg);
    }
}