package lecture_13;
import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

//       char at index 0
        System.out.println(sb.charAt(0));
//      set char at index
        sb.setCharAt(0,'P');
        System.out.println(sb);
    }
}