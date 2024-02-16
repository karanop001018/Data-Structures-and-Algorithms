/*
 *******************************************STRINGS ARE IMMUTABLE*********************************************
 */

package lecture_12;
import java.util.*;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Your name is "+name+" who is a Python Devevloper");

        //Concatenation
        String firstname = "Tony";
        String lastname = "Stark";
        String fullname = firstname+lastname;
        System.out.println("Name of Marvel character Ironman is : "+fullname);

        //Length function
        System.out.println(fullname.length());

        //charAt function
        for (int i=0;i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

        //compare 2 strings

        String name1 = "Karan";
        String name2 = "Karan";
        if (name1.compareTo(name2) == 0){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Both strings are not equal");
        }

        String name3 = "Karan";
        String name4 = "Patel";
        if (name3.compareTo(name4) == 0){
            System.out.println("Both strings are equal");
        }else {
            System.out.println("Both strings are not equal");
        }

        if (new String("Karan") == new String("Karan")){
            System.out.println("Both are equal");
        }else {
            System.out.println("Both are not equal");
        }
        //So this is why we use compareTo instead of "==" operator

        //SubString
        String sentence = "Code never lies, comments sometime does";
//      substring(beg index, end index)
        String n = sentence.substring(17, sentence.length());
        System.out.println(n);


        String s = "Code never lies, comments sometime does";
        String e = sentence.substring(26);
        System.out.println(e);

    }
}
