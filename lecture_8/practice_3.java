//Q. Write a function that takes in the radius as input and returns the circumference of a circle.

package lecture_8;
import java.util.*;
public class practice_3 {
    public static double circumference(float radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float r = sc.nextFloat();
        System.out.println(circumference(r));
    }
}
