//Print all even numbers till n.
package lecture_4.practice_lec_4;
import java.util.*;
public class even_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int a = 0; a<=n; a++){
            if (a%2==0){
                System.out.println("The even numbers till "+n+" is : \n"+a);
            }
        }
    }
}
