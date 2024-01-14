//Make a program that takes the radius of a circle as input,calculates its radius and area and prints it as output to the user.

package lecture_2.practice_lec_2;
import java.util.*;
public class areaofcircle {
    public static void main(String[] args){
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter the radius of circle:");
       double r=sc.nextDouble();
       double area=Math.PI*r*r;
       System.out.printf("The area of the circle is :%.2f ",area);
    }
}
